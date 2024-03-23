package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.ConsultantDTO;
import com.example.bankingapp.entities.Consultant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsultantMapper {

    ConsultantDTO consultantToConsultantDTO(Consultant consultant);

    Consultant consultantDTOtoConsultant(ConsultantDTO consultantDTO);
}
