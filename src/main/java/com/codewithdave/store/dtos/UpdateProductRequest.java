package com.codewithdave.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    private String name;
    private String price;
    private Byte categoryId;
}
