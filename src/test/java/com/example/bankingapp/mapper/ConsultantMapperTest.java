package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ConsultantDTO;
import com.example.bankingapp.entities.Consultant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ConsultantMapperTest {


    @Autowired
    private ConsultantMapper consultantMapper;
    @Test
    void consultantToConsultantDTO() {
        Consultant consultant = new Consultant();
        consultant.setId(1L);
        consultant.setName("John Doe");

        ConsultantDTO consultantDTO = consultantMapper.consultantToConsultantDTO(consultant);

        assertEquals(consultant.getId(), consultantDTO.getId());
        assertEquals(consultant.getName(), consultantDTO.getName());
    }

    @Test
    void consultantDTOtoConsultant() {
        ConsultantDTO consultantDTO = new ConsultantDTO();
        consultantDTO.setId(1L);
        consultantDTO.setName("John Doe");

        Consultant consultant = consultantMapper.consultantDTOtoConsultant(consultantDTO);

        assertEquals(consultantDTO.getId(), consultant.getId());
        assertEquals(consultantDTO.getName(), consultant.getName());
    }
}
