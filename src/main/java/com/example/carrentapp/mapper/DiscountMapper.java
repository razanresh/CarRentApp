package com.example.carrentapp.mapper;

import com.example.carrentapp.model.Discount;
import com.example.carrentapp.model.dto.DiscountDTO;
import org.mapstruct.Mapper;

@Mapper
public interface DiscountMapper {
    Discount toEntity(DiscountDTO discountDTO);
    DiscountDTO toDto(Discount discount);
}
