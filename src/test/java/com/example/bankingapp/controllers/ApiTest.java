package com.example.bankingapp.controllers;


import com.example.bankingapp.entities.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ApiTest {
    @Autowired
    private ClientController clientController;

    @Test
    public void testGetAllClients() {
        ResponseEntity<List<Client>> response = clientController.getAllClients();
        List<Client> clients = response.getBody();
        // Обработка полученных клиентов

        assertEquals(HttpStatus.OK, response.getStatusCode());





        // Дополнительные проверки, если необходимо, для каждого клиента в списке
        for (Client client : clients) {
            assertNotNull(client.getId());
            assertNotNull(client.getName());
            assertNotNull(client.getPassportId());
            assertNotNull(client.getConsultantId());
            // Дополнительные проверки полей клиента, если необходимо
        }



    }


}
