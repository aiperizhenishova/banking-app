package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ServiceDTO;
import com.example.bankingapp.entities.Consultant;
import com.example.bankingapp.entities.Service;
import com.example.bankingapp.entities.ServiceType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ServiceMapperTest {


    @Autowired
    private ServiceMapper serviceMapper;

    @Test
    void serviceToServiceDTO() {
        Service service = new Service();
        service.setId(1L);
        service.setCredit(1000L);
        service.setTransfer(500L);
        service.setServiceType(ServiceType.CREDIT);
        service.setDetails("Some details");
        service.setConsultant(new Consultant());
        service.getConsultant().setId(2L);

        ServiceDTO serviceDTO = serviceMapper.serviceToServiceDTO(service);

        assertEquals(service.getId(), serviceDTO.getId());
        assertEquals(service.getCredit(), serviceDTO.getCredit());
        assertEquals(service.getTransfer(), serviceDTO.getTransfer());
        assertEquals(service.getServiceType(), serviceDTO.getServiceType());
        assertEquals(service.getDetails(), serviceDTO.getDetails());
        assertEquals(service.getConsultant().getId(), serviceDTO.getConsultantId());
    }

    @Test
    void serviceDTOtoService() {
        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setId(1L);
        serviceDTO.setCredit(1000L);
        serviceDTO.setTransfer(500L);
        serviceDTO.setServiceType(ServiceType.CREDIT);
        serviceDTO.setDetails("Some details");
        serviceDTO.setConsultantId(2L);

        Service service = serviceMapper.serviceDTOtoService(serviceDTO);

        assertEquals(serviceDTO.getId(), service.getId());
        assertEquals(serviceDTO.getCredit(), service.getCredit());
        assertEquals(serviceDTO.getTransfer(), service.getTransfer());
        assertEquals(serviceDTO.getServiceType(), service.getServiceType());
        assertEquals(serviceDTO.getDetails(), service.getDetails());
        assertEquals(serviceDTO.getConsultantId(), service.getConsultant().getId());
    }
}
