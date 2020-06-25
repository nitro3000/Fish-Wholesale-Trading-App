package com.go2it.fish_wholesale_trading_test.repo;

import com.go2it.fish_wholesale_trading_test.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {


}
