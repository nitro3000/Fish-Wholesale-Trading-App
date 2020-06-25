package com.go2it.fish_wholesale_trading_test.repo;

import com.go2it.fish_wholesale_trading_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {


}
