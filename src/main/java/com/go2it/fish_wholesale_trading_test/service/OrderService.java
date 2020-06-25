package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Order;
import com.go2it.fish_wholesale_trading_test.repo.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public Optional<Order> findById(long id) {
        return orderRepository.findById (id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save (order);
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete (order);
    }
}
