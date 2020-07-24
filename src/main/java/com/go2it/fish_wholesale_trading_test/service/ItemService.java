package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.repo.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
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

    @Override
    public void updateItemById(Long id, Item item) {
        List<Item>items=findAll ();
        for(int i=0;i<items.size ();i++){
            Item item1 = items.get (i);
            if (item1.getItemId () == id){
                items.set (i, item1);
            }
        }
    }


//    @Override
//    public void save(ItemDto itemDto) {
//        Item item = new Item ( );
//        item.setItemName (itemDto.getItemName ( ));//convert from DTO to regular object
//        item.setItemPrice (itemDto.getItemPrice ( ));
//        save (item);
//    }




    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean removeByItemId(Long id) {
        itemRepository.removeByItemId (id);
        return true;
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
        return itemRepository.findByItemName (itemName);
    }


    @Override
    public double getItemPriceByItemId(long id) {
        return itemRepository.getItemPriceByItemId (id);
    }


}
