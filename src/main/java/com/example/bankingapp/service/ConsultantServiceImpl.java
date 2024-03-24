package com.example.bankingapp.service;

import com.example.bankingapp.entities.Consultant;
import com.example.bankingapp.repositories.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantServiceImpl implements ConsultantService {

    @Autowired
    private ConsultantRepository consultantRepository;

    @Override
    public Consultant createConsultant(Consultant consultant) {
        return consultantRepository.save(consultant);
    }

    @Override
    public Consultant getConsultantById(Long id) {
        return consultantRepository.findById(id).orElse(null);
    }

    @Override
    public Consultant updateConsultant(Consultant consultant) {
        return consultantRepository.save(consultant);
    }

    @Override
    public void deleteConsultant(Long id) {
        consultantRepository.deleteById(id);
    }

    @Override
    public List<Consultant> getAllConsultant() {
        return null;
    }
}
