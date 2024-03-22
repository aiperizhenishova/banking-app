package com.example.bankingapp.dto;

public class ConsultantDTO {
    private Long id;
    private String name;

    // Конструкторы
    public ConsultantDTO() {
    }

    public ConsultantDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттеры и сеттеры для полей данных
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
