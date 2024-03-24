package com.example.bankingapp.service;


import com.example.bankingapp.entities.Client;
import com.example.bankingapp.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ConsultantServiceTest {
    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void testSaveClient() {
        Client client = new Client();
        client.setName("John Doe");
        client.setPassportId("AB123456");

        Client savedClient = clientRepository.save(client);

        assertNotNull(savedClient.getId());
        assertEquals("John Doe", savedClient.getName());
    }
}
