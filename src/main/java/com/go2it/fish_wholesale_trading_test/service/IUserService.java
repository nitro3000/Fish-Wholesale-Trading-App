package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.entity.User;

import java.util.Optional;

public interface IUserService {

        Optional<User> findById(long id);

        void save (User user);

        void delete (User user);

}
