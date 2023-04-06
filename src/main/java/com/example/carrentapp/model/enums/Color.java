package com.example.carrentapp.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum Color {
    WHITE("Автомобиль белого цвета"),
    SILVER("Автомобиль серебристого или серого цвета"),
    BLACK("Автомобиль чёрного цвета"),
    MULTICOLOR("Автомобиль другого цветового оттенка");

    private final String colorDescription;
}
