package com.example.bankingapp.repositories.tests;

import com.example.bankingapp.entities.Consultant;
import com.example.bankingapp.repositories.ConsultantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ConsultantRepositoryTest {
    @Autowired
    private ConsultantRepository consultantRepository;

    @Test
    public void testSaveConsultant(){
        Consultant consultant = new Consultant();
        consultant.setName("Jessi Kim");

        Consultant savedConsultant = consultantRepository.save(consultant);
        assertNotNull(savedConsultant.getId());

    }
}
