package com.example.bankingapp.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private Long id;
    private String name;
    private String passportId;
    private Long consultantId; // Идентификатор консультанта, к которому привязан клиент



}
