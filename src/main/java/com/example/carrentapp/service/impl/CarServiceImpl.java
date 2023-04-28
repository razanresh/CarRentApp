package com.example.carrentapp.service.impl;

import com.example.carrentapp.exceptions.ResourceNotFoundException;
import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.Image;
import com.example.carrentapp.model.enums.Category;
import com.example.carrentapp.model.enums.Color;
import com.example.carrentapp.model.enums.EngineType;
import com.example.carrentapp.model.enums.Transmission;
import com.example.carrentapp.repository.CarRepository;
import com.example.carrentapp.service.CarService;
import com.example.carrentapp.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarService carService;
    private final ImageService imageService;
    private final CarRepository carRepository;
    @Override
    public Car create(Car car) {

            car.setModel(car.getModel());
            car.setDescription(car.getDescription());
            car.setMnfYear(car.getMnfYear());
            car.setEngineVolume(car.getEngineVolume());
            car.setCategory(car.getCategory());
            car.setEngineType(car.getEngineType());
            car.setColor(car.getColor());
            car.setTransmission(car.getTransmission());
            car.setGasPer100(car.getGasPer100());
            car.setIsAvailable(true);
            car.setImage(car.getImage());
            return carRepository.save(car);
    }

    @Override
    public Car update(Long id, Car car) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isEmpty()) {
            throw new ResourceNotFoundException("Car not found with id: " +  id);
        }
        Car existingCar = optionalCar.get();

        // Обновляем поля объекта
        existingCar.setModel(car.getModel());
        existingCar.setDescription(car.getDescription());
        existingCar.setMnfYear(car.getMnfYear());
        existingCar.setEngineVolume(car.getEngineVolume());
        existingCar.setIsAvailable(car.getIsAvailable());
        existingCar.setImage(car.getImage());

        // Сохраняем измененный объект в базе данных
        return carRepository.save(existingCar);
    }

    @Override
    public Car deleteById(Long id) {
        Car car = getById(id);
        if(car != null){
            imageService.deleteByName(car.getImage().getName());
        }
        carRepository.deleteById(id);
        return car;
    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
    @Override
    public Car changeAvailable(Long carId, Boolean isAvailable){
        Car car = getById(carId);
        if(car == null){
            return null;
        }
        car.setIsAvailable(isAvailable);
        return carRepository.save(car);
    }
    @Override
    public Car updateImage(Long carId, Image image){
        Car car = getById(carId);
        if(car == null) return null;

        car.setImage(image);
        return carRepository.save(car);
    }


    // Методы для поиска(выведения) списков машин по определённым параметрам.
    @Override
    public List<Car> findByCategory(Category category) {
        return carService.findByCategory(category);
    }

    @Override
    public List<Car> findByColor(Color color) {
        return carService.findByColor(color);
    }

    @Override
    public List<Car> findByEngineType(EngineType engineType) {
        return carService.findByEngineType(engineType);
    }

    @Override
    public List<Car> findByTransmission(Transmission transmission) {
        return carService.findByTransmission(transmission);
    }

    @Override
    public List<Car> findByModel(String model) {
        return carService.findByModel(model);
    }

    @Override
    public List<Car> findByDescription(String description) {
        return carService.findByDescription(description);
    }

    @Override
    public List<Car> findByMnfYear(Integer mnfYear) {
        return carService.findByMnfYear(mnfYear);
    }

    @Override
    public List<Car> findByEngineVolume(Double engineVolume) {
        return carService.findByEngineVolume(engineVolume);
    }

    @Override
    public List<Car> findByGasPer100(Double gasPer100) {
        return carService.findByGasPer100(gasPer100);
    }

    @Override
    public List<Car> findByIsAvailable(Boolean isAvailable) {
        return carService.findByIsAvailable(isAvailable);
    }

    @Override
    public List<Car> findByPrice(Double price) {
        return carService.findByPrice(price);
    }
}
