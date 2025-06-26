package com.codewithdave.store.controllers;

import com.codewithdave.store.dtos.CreateProductRequest;
import com.codewithdave.store.dtos.ProductDto;
import com.codewithdave.store.dtos.UpdateProductRequest;
import com.codewithdave.store.dtos.UpdateUserRequest;
import com.codewithdave.store.entities.Category;
import com.codewithdave.store.entities.Product;
import com.codewithdave.store.mappers.ProductMapper;
import com.codewithdave.store.repositories.CategoryRepository;
import com.codewithdave.store.repositories.ProductRepository;
import com.codewithdave.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    @GetMapping
    public Iterable<ProductDto> fetchAllProducts(@RequestParam(required = false, name = "categoryId") Byte categoryId){
        List<Product> productList;

        if(categoryId != null){
            productList = productRepository.getProductsByCategoryId(categoryId);
        } else {
            productList = productRepository.findAll();
        }

        return productList
                .stream()
                .map(productMapper::toProductDto)
                .toList();
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> fetchProduct(@PathVariable Long id){
        var product = productRepository.findById(id).orElse(null);
        if(product == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(productMapper.toProductDto(product));
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody CreateProductRequest createProductRequest,
                                                    UriComponentsBuilder uriBuilder){

        Category category = categoryRepository.findById(createProductRequest.getCategoryId()).orElse(null);
        if(category == null){
            return ResponseEntity.badRequest().build();
        }

        var product = productMapper.toProduct(createProductRequest);
        product.setCategory(category);
        productRepository.save(product);
        product.setId(product.getId());

        var productDto = productMapper.toProductDto(product);
        var uri = uriBuilder.path("/products/{id}").buildAndExpand(productDto.getId()).toUri();

        return ResponseEntity.created(uri).body(productDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> updateProduct(@RequestBody UpdateProductRequest updateProductRequest,
                                                    @PathVariable(name = "id") Long id){
        var product = productRepository.findById(id).orElse(null);
        if(product == null){
            return ResponseEntity.notFound().build();
        }

        var category = categoryRepository.findById(updateProductRequest.getCategoryId()).orElse(null);
        if(category == null){
            return ResponseEntity.badRequest().build();
        }

        productMapper.update(updateProductRequest, product);
        product.setCategory(category);
        productRepository.save(product);

        return ResponseEntity.ok(productMapper.toProductDto(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        var product = productRepository.findById(id).orElse(null);
        if(product == null){
            return ResponseEntity.notFound().build();
        }

        productRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
