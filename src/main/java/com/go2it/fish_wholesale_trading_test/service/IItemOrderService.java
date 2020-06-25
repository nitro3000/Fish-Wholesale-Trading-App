package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.ItemOrder;
import com.go2it.fish_wholesale_trading_test.entity.User;

import java.util.Optional;

public interface IItemOrderService {
    Optional<ItemOrder> findById(long id);

    void save (ItemOrder itemOrder);

    void delete (ItemOrder itemOrder);
}
