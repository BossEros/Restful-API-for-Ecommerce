package com.codewithdave.store.mappers;

import com.codewithdave.store.dtos.OrderDto;
import com.codewithdave.store.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
