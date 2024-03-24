package com.example.bankingapp.service;

import com.example.bankingapp.entities.Service;
import com.example.bankingapp.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service createService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public Service updateService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<Service> getAllServices() {
        return null;
    }
}
