package com.go2it.fish_wholesale_trading_test.repo;

import com.go2it.fish_wholesale_trading_test.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item,Long> {

}
