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



    public Long getId() {
        return id;
    }

    public ServiceDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCredit() {
        return credit;
    }

    public ServiceDTO setCredit(Long credit) {
        this.credit = credit;
        return this;
    }

    public Long getTransfer() {
        return transfer;
    }

    public ServiceDTO setTransfer(Long transfer) {
        this.transfer = transfer;
        return this;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public ServiceDTO setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public ServiceDTO setDetails(String details) {
        this.details = details;
        return this;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public ServiceDTO setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
        return this;
    }
}
