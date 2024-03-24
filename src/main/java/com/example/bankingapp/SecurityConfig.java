package com.example.bankingapp;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.net.http.HttpClient;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.bankingapp")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public SecurityConfig(){
        System.out.println("   SecurityConfig is loaded");
        System.out.println("   SecurityConfig is loaded");
        System.out.println("   SecurityConfig is loaded");
        System.out.println("   SecurityConfig is loaded");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .anyRequest().permitAll()  // Разрешить доступ ко всем ресурсам без аутентификации
                .and()
                .httpBasic().disable()     // Отключить HTTP базовую аутентификацию
                .formLogin().disable();    // Отключить форму аутентификации


    }
}
