package com.example.carrentapp.mapper;

import com.example.carrentapp.model.Address;
import com.example.carrentapp.model.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    Address toEntity(AddressDTO addressDTO);
    AddressDTO toDto(Address address);
}
