package com.gerenciadordeusuarios.services;

import java.util.List;

import com.gerenciadordeusuarios.entities.User;

/**
 * 
 */

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
