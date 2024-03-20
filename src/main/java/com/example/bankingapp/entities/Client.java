package com.example.bankingapp.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportId;


    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;


}
