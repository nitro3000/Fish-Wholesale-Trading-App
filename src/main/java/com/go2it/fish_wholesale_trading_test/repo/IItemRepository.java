package com.go2it.fish_wholesale_trading_test.repo;

import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IItemRepository extends JpaRepository<Item,Long> {

     double getItemPriceByItemId(long id);

    Optional<Item> findByItemName(String itemName);

     void removeByItemId (Long id);

//    @Query("SELECT " +
//            "new com.go2it.fish_wholesale_trading_test.entity.Item(i.itemPrice)" +
//            "FROM " +
//            " item i " +
//            "GROUP BY" +
//            " p.merchant.name")
//    Double getItemPriceByItemId();



}
