package com.example.bankingapp.service;

import com.example.bankingapp.entities.Service;

import java.util.List;

public interface ServiceService {
    Service createService(Service service);
    Service getServiceById(Long id);
    Service updateService(Service service);
    void deleteService(Long id);

    List<Service>getAllServices();
}
