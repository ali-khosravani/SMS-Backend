package com.p3soft.sms.serviceimpl;

import com.p3soft.sms.model.Users;
import com.p3soft.sms.repository.UsersRepository;
import com.p3soft.sms.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ali Kosravani
 * @since 1402/06/08
 */
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
        return optionalUsers.orElse(null);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }


    @Override
    public Users updateUser(Users users) {
        Users existingUser = usersRepository.findById(users.getId()).orElse(null);
        assert existingUser != null;
        existingUser.setFirstName(users.getFirstName());
        existingUser.setLastName((users.getLastName()));
        existingUser.setEmail(users.getEmail());
        existingUser.setPassword(users.getPassword());
        return usersRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }
}
