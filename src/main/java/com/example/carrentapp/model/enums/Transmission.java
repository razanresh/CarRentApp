package com.example.carrentapp.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum Transmission {
    MECHANICAL("Автомобиль с механической коробкой передач"),
    AUTOMATIC("Автомобиль с автоматической коробкой передач"),
    ROBOTIC("Автомобиль с роботизированной коробкой передач"),
    VARIABLE("Автомобиль с вариаторной(бесступенчатой) коробкой передач");

    private final String transmissionDescription;
}
