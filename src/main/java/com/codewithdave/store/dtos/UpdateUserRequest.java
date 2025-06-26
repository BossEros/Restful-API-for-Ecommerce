package com.codewithdave.store.dtos;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String name;
    private String email;
}
