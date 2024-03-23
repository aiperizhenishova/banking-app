package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ServiceDTO;
import com.example.bankingapp.entities.Service;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    @Mapping(source = "consultant.id", target = "consultantId")
    ServiceDTO serviceToServiceDTO(Service service);

    @Mapping(source = "consultantId", target = "consultant.id")
    Service serviceDTOtoService(ServiceDTO serviceDTO);
}
