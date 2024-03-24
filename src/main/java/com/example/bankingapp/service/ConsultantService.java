package com.example.bankingapp.service;

import com.example.bankingapp.entities.Consultant;

import java.util.List;

public interface ConsultantService {
    Consultant createConsultant(Consultant consultant);
    Consultant getConsultantById(Long id);
    Consultant updateConsultant(Consultant consultant);
    void deleteConsultant(Long id);

    List<Consultant> getAllConsultant();
}
