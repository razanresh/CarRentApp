package com.example.carrentapp.mapper;

import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.dto.CarDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CarMapper{

    Car toEntity(CarDTO CarDTO);
    CarDTO toDto(Car car);

}
