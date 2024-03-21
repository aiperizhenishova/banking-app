package com.example.bankingapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue
    private Long id;
    private Long credit;
    private Long transfer;

    @Enumerated(EnumType.STRING)
    private ServiceType  serviceType; // Тип предоставленной услуги (кредит, выдача карты и т.д.)

    private String details; // Дополнительные детали о предоставленной услуге



    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;

    public void setCard(long l) {
    }
}
