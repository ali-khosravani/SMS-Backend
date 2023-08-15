package com.p3soft.sms.controller;

import com.p3soft.sms.model.Users;
import com.p3soft.sms.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/users")
public class UsersController {


    private UsersService usersService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        Users savedUser = usersService.createUser(users);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
    public ResponseEntity<Users> getUserById(@PathVariable("id") Long userId) {
        Users users = usersService.getUserById(userId);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Users> updateUser(@PathVariable("id") Long userId, @RequestBody Users users) {
        users.setId(userId);
        Users updatedUser = usersService.updateUser(users);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        usersService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
