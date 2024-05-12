package com.example.bankingapp.repositories;

import com.example.bankingapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    String getUsername();

    String getPassword();

    Collection<? extends GrantedAuthority> getRoles();
}
