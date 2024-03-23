package com.example.bankingapp.entities;

import jakarta.persistence.*;


import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportId;


    public Long getId() {
        return id;
    }

    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassportId() {
        return passportId;
    }

    public Client setPassportId(String passportId) {
        this.passportId = passportId;
        return this;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public Client setConsultant(Consultant consultant) {
        this.consultant = consultant;
        return this;
    }

    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;


}
