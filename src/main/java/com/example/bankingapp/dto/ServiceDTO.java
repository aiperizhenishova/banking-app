package com.example.bankingapp.dto;

public class ServiceDTO {
    private Long id;
    private Long credit;
    private Long transfer;
    private String serviceType;
    private String details;
    private Long consultantId;

    // Конструкторы
    public ServiceDTO() {
    }

    public ServiceDTO(Long id, Long credit, Long transfer, String serviceType, String details, Long consultantId) {
        this.id = id;
        this.credit = credit;
        this.transfer = transfer;
        this.serviceType = serviceType;
        this.details = details;
        this.consultantId = consultantId;
    }

    // Геттеры и сеттеры для полей данных
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public Long getTransfer() {
        return transfer;
    }

    public void setTransfer(Long transfer) {
        this.transfer = transfer;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }
}
