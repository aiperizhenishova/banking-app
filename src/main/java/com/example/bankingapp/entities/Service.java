package com.example.bankingapp.entities;


import jakarta.persistence.*;


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


    public Long getId() {
        return id;
    }

    public Service setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCredit() {
        return credit;
    }

    public Service setCredit(Long credit) {
        this.credit = credit;
        return this;
    }

    public Long getTransfer() {
        return transfer;
    }

    public Service setTransfer(Long transfer) {
        this.transfer = transfer;
        return this;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public Service setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public Service setDetails(String details) {
        this.details = details;
        return this;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public Service setConsultant(Consultant consultant) {
        this.consultant = consultant;
        return this;
    }
}
