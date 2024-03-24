package com.example.bankingapp.service;

import com.example.bankingapp.entities.Service;

public interface ServiceService {
    Service createService(Service service);
    Service getServiceById(Long id);
    Service updateService(Service service);
    void deleteService(Long id);
}
