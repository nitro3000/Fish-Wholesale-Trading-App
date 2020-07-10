package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.repo.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements IItemService {
    @Autowired
    private IItemRepository itemRepository;

    @Override
    public void save(Item item) {
        itemRepository.save (item);
    }

//    @Override
//    public void save(ItemDto itemDto) {
//        Item item = new Item ( );
//        item.setItemName (itemDto.getItemName ( ));//convert from DTO to regular object
//        item.setItemPrice (itemDto.getItemPrice ( ));
//        save (item);
//    }

    @Override
    public void update(Item item) {
    }

    @Override
    public void delete(Item item) {
        itemRepository.delete (item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll ( );
    }

    @Override
    public Optional<Item> findById(long id) {
        return itemRepository.findById (id);
    }

    @Override
    public Optional<Item> findByItemName(String itemName) {
        return findByItemName (itemName);
    }


    @Override
    public double getItemPriceByItemId(long id) {
        return itemRepository.getItemPriceByItemId (id);
    }


}
