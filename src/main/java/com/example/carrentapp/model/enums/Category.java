package com.example.carrentapp.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum Category{
    A("мини-автомобили"),
    B("маленькие автомобили"),
    C("среднеразмерные автомобили"),
    D("полноразмерные автомобили"),
    E("автомобили бизнес-класса"),
    F("предтставительские автомобили"),
    S("спортивные купе"),
    M("минивэны и коммерческие автомобили"),
    J("кроссовкры и внедорожники");


    private final String categoryDescription;

}
