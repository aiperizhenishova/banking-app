package com.example.bankingapp.service;

import com.example.bankingapp.entities.Client;

import java.util.List;

public interface ClientService {

    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Client client);
    void deleteClient(Long id);

    List<Client> getAllClients();
}
