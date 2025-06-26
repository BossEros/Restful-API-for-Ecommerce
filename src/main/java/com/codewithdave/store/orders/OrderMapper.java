package com.codewithdave.store.orders;

import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
