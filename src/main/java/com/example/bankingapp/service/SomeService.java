//package com.example.bankingapp.service;
//
//import com.example.bankingapp.dto.ClientDTO;
//import com.example.bankingapp.dto.ConsultantDTO;
//import com.example.bankingapp.dto.ServiceDTO;
//import com.example.bankingapp.entities.Client;
//import com.example.bankingapp.entities.Consultant;
//import com.example.bankingapp.entities.ServiceType;
//import com.example.bankingapp.mapper.ClientMapper;
//import com.example.bankingapp.mapper.ConsultantMapper;
//import com.example.bankingapp.mapper.ServiceMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SomeService {
//    private final ClientMapper clientMapper;
//    private final ConsultantMapper consultantMapper;
//    private final ServiceMapper serviceMapper;
//
//    @Autowired
//    public SomeService(ClientMapper clientMapper, ConsultantMapper consultantMapper, ServiceMapper serviceMapper) {
//        this.clientMapper = clientMapper;
//        this.consultantMapper = consultantMapper;
//        this.serviceMapper = serviceMapper;
//    }
//
//    public void someMethod() {
//        // Пример использования маппера для объекта Client
//        Client client = new Client();
//        client.setId(1L);
//        client.setName("John Doe");
//        client.setPassportId("AB123456");
//        client.getConsultant().setId(2L);
//
//        ClientDTO clientDTO = clientMapper.clientToClientDTO(client);
//
//        // Другие операции с мапперами...
//    }
//
//    public void someOtherMethod() {
//        // Пример использования маппера для объекта Consultant
//        Consultant consultant = new Consultant();
//        consultant.setId(1L);
//        consultant.setName("Jane Doe");
//
//        ConsultantDTO consultantDTO = consultantMapper.consultantToConsultantDTO(consultant);
//
//        // Другие операции с мапперами...
//    }
//
//    public void anotherMethod() {
//        Service service = new Service();
//        service.setId(1L);
//        service.setCredit(1000L);
//        service.setTransfer(500L);
//        service.setServiceType(ServiceType.CREDIT);
//        service.setDetails("Some details");
//
//        Consultant consultant = new Consultant();
//        consultant.setId(2L);
//        service.setConsultant (consultant);
//
//        ServiceDTO serviceDTO = serviceMapper.serviceToServiceDTO(service);
//
//        // Другие операции с мапперами...
//    }
//}
