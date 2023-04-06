package com.example.carrentapp.model.dto;

import com.example.carrentapp.model.Car;
import lombok.Data;

import java.util.List;

@Data
public class CarDetailsDTO {
    Car car;
    List<String> reservedDates;
}
