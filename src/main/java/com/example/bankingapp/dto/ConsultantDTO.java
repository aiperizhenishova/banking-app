package com.example.bankingapp.dto;

import lombok.Data;

@Data
public class ConsultantDTO {
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public ConsultantDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ConsultantDTO setName(String name) {
        this.name = name;
        return this;
    }
}
