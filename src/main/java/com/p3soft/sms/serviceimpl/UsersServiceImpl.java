package com.p3soft.sms.serviceimpl;

import com.p3soft.sms.model.Users;
import com.p3soft.sms.repository.UsersRepository;
import com.p3soft.sms.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {
    private UsersRepository usersRepository;
    @Override
    public Users createUser(Users users) {
        return usersRepository.save(users);
    }


    @Override
    public Users getUserById(Long userId) {
        Optional<Users> optionalUsers =usersRepository.findById(userId);
        return optionalUsers.get();
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) usersRepository.findAll();
    }

    @Override
    public Users updateUser(Users users) {
        Users existingUser = usersRepository.findById(users.getId()).get();
        existingUser.setFirstName(users.getFirstName());
        existingUser.setLastName((users.getLastName()));
        existingUser.setEmail(users.getEmail());
        existingUser.setPassword(users.getPassword());
        Users updatedUser=usersRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }
}
