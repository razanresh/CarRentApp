package com.example.carrentapp.controller;

import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.dto.CarDetailsDTO;
import com.example.carrentapp.repository.CarRepository;
import com.example.carrentapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import static com.example.carrentapp.service.CarService.carRepository;

@Controller
public class CarController {

    @Autowired
    private CarService carService;
    @Autowired
    private CarRepository carRepository;
    @GetMapping("/add")
    public String showCarForm(Model model){
        model.addAttribute("car",new Car());
        return "add-car-form";
    }


    @PostMapping("/save")
    public String saveCar(@ModelAttribute("car") Car car) {
        carRepository.save(car);
        return "redirect:/car/list";
    }

    @GetMapping("/cars")
    public String findAllCars(Model model) {
        List<CarDetailsDTO> carDetailsList = carService.findAllActive();
        model.addAttribute("carDetailsList", carDetailsList);
        return "car-list";
    }

}
