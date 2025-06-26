package com.codewithdave.store.services;

import com.codewithdave.store.dtos.OrderDto;
import com.codewithdave.store.exceptions.OrderNotFoundException;
import com.codewithdave.store.mappers.OrderMapper;
import com.codewithdave.store.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService {
    private final AuthService authService;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDto> getAllOrders(){
        var user = authService.getCurrentUser();
        var orders = orderRepository.getOrdersByCustomer(user);

        return orders.stream().map(orderMapper::toDto).toList();
    }

    public OrderDto getOrder(Long orderId) {
        var order = orderRepository
                .getOrderWithItems(orderId)
                .orElseThrow(OrderNotFoundException::new);

        var user = authService.getCurrentUser();
        if(!order.isPlacedby(user)){
            throw new AccessDeniedException("You don't have access to this order");
        }

        return orderMapper.toDto(order);
    }
}
