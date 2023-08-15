package com.p3soft.sms.service;

import com.p3soft.sms.model.Users;

import java.util.List;

public interface UsersService {
    Users createUser(Users users);
    Users getUserById(Long userId);
    List<Users> getAllUsers();
    Users updateUser(Users users);
    void deleteUser(Long userId);
}
