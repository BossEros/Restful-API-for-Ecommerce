package com.codewithdave.store.mappers;

import com.codewithdave.store.dtos.RegisterUserRequest;
import com.codewithdave.store.dtos.UpdateUserRequest;
import com.codewithdave.store.dtos.UserDto;
import com.codewithdave.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
