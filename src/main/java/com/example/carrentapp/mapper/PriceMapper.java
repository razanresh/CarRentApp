package com.example.carrentapp.mapper;

import com.example.carrentapp.model.Price;
import com.example.carrentapp.model.dto.PriceDTO;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;


@Mapper
public interface PriceMapper {
    ModelMapper modelMapper = new ModelMapper();
    Price convertToEntity(PriceDTO priceDTO);
    PriceDTO convertToDto(Price price);
}
