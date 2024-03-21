package com.example.bankingapp.repositories;

import com.example.bankingapp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository предоставляет основные методы  для работы с сущностями
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
