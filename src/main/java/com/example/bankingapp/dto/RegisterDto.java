package com.example.bankingapp.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public RegisterDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
