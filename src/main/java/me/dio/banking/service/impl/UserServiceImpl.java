package me.dio.banking.service.impl;

import me.dio.banking.domain.model.User;
import me.dio.banking.domain.repository.UserRepository;
import me.dio.banking.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountRm(userToCreate.getAccount().getRm())) {
            throw new IllegalArgumentException("This Account rm already exists;");
        }
        return userRepository.save(userToCreate);
    }
}
