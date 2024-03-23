package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ClientDTO;
import com.example.bankingapp.entities.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest

public class ClientMapperTest {

    @Autowired
    private ClientMapper clientMapper;

    @Test
    void clientToClientDTO() {
        // Создание тестовых данных
        Client client = new Client();
        client.setId(1L);
        client.setName("John Doe");
        client.setPassportId("AB123456");
        client.getConsultant().setId(2L);

        // Преобразование с помощью маппера
        ClientDTO clientDTO = clientMapper.clientToClientDTO(client);

        // Проверка результатов
        assertEquals(client.getId(), clientDTO.getId());
        assertEquals(client.getName(), clientDTO.getName());
        assertEquals(client.getPassportId(), clientDTO.getPassportId());
        assertEquals(client.getConsultant().getId(), clientDTO.getConsultantId());
    }

    @Test
    void clientDTOtoClient() {
        // Создание тестовых данных
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(1L);
        clientDTO.setName("John Doe");
        clientDTO.setPassportId("AB123456");
        clientDTO.setConsultantId(2L);

        // Преобразование с помощью маппера
        Client client = clientMapper.clientDTOtoClient(clientDTO);

        // Проверка результатов
        assertEquals(clientDTO.getId(), client.getId());
        assertEquals(clientDTO.getName(), client.getName());
        assertEquals(clientDTO.getPassportId(), client.getPassportId());
        assertEquals(clientDTO.getConsultantId(), client.getConsultant().getId());
    }
}
