package com.codewithdave.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRequest {
    private String name;
    private BigDecimal price;
    private Byte categoryId;
}
