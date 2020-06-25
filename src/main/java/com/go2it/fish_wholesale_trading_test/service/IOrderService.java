package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Order;
import com.go2it.fish_wholesale_trading_test.entity.User;

import java.util.Optional;

public interface IOrderService {
    Optional<Order> findById(long id);

    void save (Order order);

    void delete (Order order);
}
