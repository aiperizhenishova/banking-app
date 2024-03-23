package com.example.bankingapp.dto;

import com.example.bankingapp.entities.ServiceType;
import lombok.Data;

@Data
public class ServiceDTO {
    private Long id;
    private Long credit;
    private Long transfer;
    private ServiceType serviceType;
    private String details;
    private Long consultantId; // Идентификатор консультанта, к которому привязана услуга



}
