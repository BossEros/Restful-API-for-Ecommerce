package com.codewithdave.store.mappers;

import com.codewithdave.store.dtos.ChangePasswordRequest;
import com.codewithdave.store.dtos.CreateProductRequest;
import com.codewithdave.store.dtos.ProductDto;
import com.codewithdave.store.dtos.UpdateProductRequest;
import com.codewithdave.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toProductDto(Product product);
    Product toProduct(CreateProductRequest createProductRequest);

    @Mapping(target = "id", ignore = true)
    void update(UpdateProductRequest updateProductRequest, @MappingTarget Product product);
}
