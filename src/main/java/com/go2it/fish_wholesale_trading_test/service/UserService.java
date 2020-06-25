package com.go2it.fish_wholesale_trading_test.service;

import com.go2it.fish_wholesale_trading_test.entity.User;
import com.go2it.fish_wholesale_trading_test.repo.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById (id);
    }

    @Override
    public void save(User user) {
        userRepository.save (user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete (user);
    }
}
