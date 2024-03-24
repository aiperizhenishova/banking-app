package com.example.bankingapp.service;

import com.example.bankingapp.entities.Service;
import com.example.bankingapp.entities.ServiceType;
import com.example.bankingapp.repositories.ServiceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceServiceTest {

    @Mock
    private ServiceRepository serviceRepository;

    @InjectMocks
    private ServiceService serviceService = new ServiceServiceImpl() {
        @Override
        public List<Service> getAllServices() {
            return null;
        }
    };

    @Test
    public void testCreateService() {
        Service service = new Service();
        service.setId(1L);
        service.setCredit(1000L);
        service.setTransfer(500L);
        service.setServiceType(ServiceType.CREDIT);
        service.setDetails("Credit service");

        when(serviceRepository.save(service)).thenReturn(service);

        Service savedService = serviceService.createService(service);

        assertEquals(ServiceType.CREDIT, savedService.getServiceType());
    }

}
