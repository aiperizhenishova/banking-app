package com.example.bankingapp.service;

import com.example.bankingapp.entities.User;

public interface UserService {
    User findByUsername(String username);
    User save(User user);
    // Другие методы, например, для аутентификации, обновления пароля и т. д.
}
