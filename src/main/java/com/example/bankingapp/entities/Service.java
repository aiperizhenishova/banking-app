package com.example.bankingapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue
    private Long card;
    private Long credit;
    private Long transfer;

    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;
}
