package com.example.carrentapp.model.dto;

import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.UserAccount;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class OrderDetailsDTO {
    private Long id;
    private Car car;
    private Boolean babySeat;
    private Boolean withDriver;
    private String dateTimeFrom;
    private String dateTimeTo;
    private Double priceBeforeDiscount;
    private Double priceWithDiscount;
}
