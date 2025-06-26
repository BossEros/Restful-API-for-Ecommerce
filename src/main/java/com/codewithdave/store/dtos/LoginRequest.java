package com.codewithdave.store.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email is invalid")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 25, message = "Password must be 8-25 characters long")
    private String password;
}
