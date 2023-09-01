package com.p3soft.sms.service;

import com.p3soft.sms.model.Users;

import java.util.List;

/**
 * @author Ali Kosravani
 * @since 1402/06/08
 */
public interface UsersService {
    Users createUser(Users users);
    Users getUserById(Long userId);
    List<Users> getAllUsers();
    Users updateUser(Users users);
    void deleteUser(Long userId);
}
