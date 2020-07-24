package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Item;

import java.util.List;
import java.util.Optional;

public interface IItemService {

    void save(Item item);

    void updateItemById(Long id,Item item);

    boolean removeByItemId(Long id);

    List<Item> findAll();

    Optional<Item> findById(long id);

    Optional<Item> findByItemName(String itemName);

    double getItemPriceByItemId(long id);

}
