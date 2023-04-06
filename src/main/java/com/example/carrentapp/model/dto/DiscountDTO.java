package com.example.carrentapp.model.dto;

import com.example.carrentapp.model.Car;
import lombok.Data;


@Data
public class DiscountDTO {
    private Long id;

    private Car car;
    private Double discount;

}

