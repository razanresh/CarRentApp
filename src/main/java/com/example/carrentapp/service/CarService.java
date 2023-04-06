package com.example.carrentapp.service;

import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.UserAccount;
import com.example.carrentapp.model.enums.Category;
import com.example.carrentapp.model.enums.Color;
import com.example.carrentapp.model.enums.EngineType;
import com.example.carrentapp.model.enums.Transmission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public interface CarService {
    Car create(Car car);
    Car update(Car car);
    Car deleteById(Long id);
    List<Car> getAll();
    Car getById(Long id);
    List<Car> findByCategory(Category category);

    List<Car> findByColor(Color color);

    List<Car> findByEngineType(EngineType engineType);

    List<Car> findByTransmission(Transmission transmission);

    List<Car> findByModel(String model);
    List<Car> findByDescription(String description);
    List<Car> findByMnfYear(Integer mnfYear);
    List<Car> findByEngineVolume(Double engineVolume);
    List<Car> findByGasPer100(Double gasPer100);
    List<Car> findByIsAvailable(Boolean isAvailable);
    List<Car> findByPrice(Double price);

    }
