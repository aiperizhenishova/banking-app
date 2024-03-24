package com.example.bankingapp.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private Long id;
    private String name;
    private String passportId;
    private Long consultantId; // Идентификатор консультанта, к которому привязан клиент






    public Long getId() {
        return id;
    }

    public ClientDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClientDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassportId() {
        return passportId;
    }

    public ClientDTO setPassportId(String passportId) {
        this.passportId = passportId;
        return this;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public ClientDTO setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
        return this;
    }
}
