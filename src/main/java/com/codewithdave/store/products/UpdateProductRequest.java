package com.codewithdave.store.products;

import lombok.Data;

@Data
public class UpdateProductRequest {
    private String name;
    private String price;
    private Byte categoryId;
}
