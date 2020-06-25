package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.repo.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements IItemService {
    @Autowired
    private IItemRepository itemRepository;

    @Override
    public Optional<Item> findById(long id) {
        return itemRepository.findById (id);
    }

    @Override
    public void save(Item item) {
        itemRepository.save (item);
    }

    @Override
    public void update(Item item) {

    }

    @Override
    public void delete(Item item) {
        itemRepository.delete (item);

    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll ();
    }

}
