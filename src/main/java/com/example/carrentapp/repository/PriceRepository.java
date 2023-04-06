package com.example.carrentapp.repository;

import com.example.carrentapp.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
