package com.example.carrentapp.mapper;

import com.example.carrentapp.model.Price;
import com.example.carrentapp.model.dto.PriceDTO;

public interface PriceMapper {
    Price toEntity(PriceDTO priceDTO);
    PriceDTO toDto(Price price);
}
