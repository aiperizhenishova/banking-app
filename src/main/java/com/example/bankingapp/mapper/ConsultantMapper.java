package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ConsultantDTO;
import com.example.bankingapp.entities.Consultant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ConsultantMapper {

    @Mapping(target = "id", ignore = true)
    ConsultantDTO consultantToConsultantDTO(Consultant consultant);

    Consultant consultantDTOtoConsultant(ConsultantDTO consultantDTO);
}
