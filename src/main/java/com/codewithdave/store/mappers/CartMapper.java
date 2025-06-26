package com.codewithdave.store.mappers;

import com.codewithdave.store.dtos.CartDto;
import com.codewithdave.store.dtos.CartItemDto;
import com.codewithdave.store.entities.Cart;
import com.codewithdave.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface CartMapper {
    @Mapping(target = "items", source = "items")
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
