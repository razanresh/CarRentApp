package com.example.carrentapp.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EngineType {
    PETROL("Автомобиль с бензиновым двигателем"),
    DIESEL("Автомобиль с дизельным двигателем"),
    HYBRID("Автомобиль с гибридным двигателем"),
    GAS("Автомобиль с газовым двигателем");
    private final String engineTypeDescription;
}
