package com.example.bankingapp.repositories.tests;

import com.example.bankingapp.entities.Client;
import com.example.bankingapp.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClientRepositoryTest {
    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void testSaveClient(){
        Client client = new Client();
        client.setName("Mike Park");
        client.setPassportId("1756765108");

        Client savedClient = clientRepository.save(client);
        assertNotNull(savedClient.getId());
    }
}
