package com.example.bankingapp.entities;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    // геттеры и сеттеры, конструкторы и другие методы
}