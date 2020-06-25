package com.go2it.fish_wholesale_trading_test.repo;

import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.entity.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IItemOrderRepository extends JpaRepository<ItemOrder,Long> {

}
