package com.polymoly.demo.services;

import java.util.List;

import com.polymoly.demo.entities.User;

public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
}
