package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;

import java.util.List;
import java.util.Optional;

public interface IItemService {
    Optional<Item> findById(long id);

    void save (Item item);
    void save (ItemDto itemDto);

    void update (Item item);

    void delete (Item item);

    List<Item> findAll();

}
