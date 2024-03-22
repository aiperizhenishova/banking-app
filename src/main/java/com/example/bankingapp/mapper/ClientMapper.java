package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ClientDTO;
import com.example.bankingapp.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(source = "consultant.id", target = "consultantId")
    ClientDTO clientToClientDTO(Client client);
}
