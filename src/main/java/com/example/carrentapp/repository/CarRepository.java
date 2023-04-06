package com.example.carrentapp.repository;
import com.example.carrentapp.model.Car;
import com.example.carrentapp.model.enums.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findById(Long id);

}
