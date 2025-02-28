package me.dio.banking.service;

import me.dio.banking.domain.model.User;

public interface UserService {
    User findById(long id);
    User create(User userToCreate);
}
