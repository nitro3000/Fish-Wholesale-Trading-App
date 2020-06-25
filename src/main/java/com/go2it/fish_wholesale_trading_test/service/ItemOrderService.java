package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.ItemOrder;
import com.go2it.fish_wholesale_trading_test.repo.IItemOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemOrderService implements IItemOrderService {

    @Autowired
    private IItemOrderRepository itemOrderRepository;


    @Override
    public Optional<ItemOrder> findById(long id) {
        return itemOrderRepository.findById (id);
    }

    @Override
    public void save(ItemOrder itemOrder) {
        itemOrderRepository.save (itemOrder);
    }

    @Override
    public void delete(ItemOrder itemOrder) {
        itemOrderRepository.delete (itemOrder);
    }
}
