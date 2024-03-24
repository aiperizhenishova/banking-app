package com.example.bankingapp.service;


import com.example.bankingapp.entities.Client;
import com.example.bankingapp.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService = new ClientServiceImpl();

    @Test
    public void testCreateClient() {
        Client client = new Client();
        client.setId(1L);
        client.setName("John Doe");
        client.setPassportId("AB123456");

        when (clientRepository.save(client)).thenReturn(client);

        Client savedClient = clientService.createClient(client);

        assertEquals("John Doe", savedClient.getName());
    }


}
