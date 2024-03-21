package com.example.bankingapp.repositories.tests;

import com.example.bankingapp.entities.Service;
import com.example.bankingapp.repositories.ServiceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ServiceRepositoryTest {
    @Autowired
    private ServiceRepository serviceRepository;

    @Test
    public void testSaveService(){
        Service service = new Service();
        service.setCard(123456L);
        service.setCredit(5000L);
        service.setTransfer(100L);

        Service savedService = serviceRepository.save(service);

        // Проверить, что объект успешно сохранен
        assertNotNull(savedService);
        assertNotNull(savedService.getId());
        assertTrue(savedService.getId() > 0); // Убедиться, что ID больше 0
    }
}

