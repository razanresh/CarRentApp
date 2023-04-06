package com.example.carrentapp.repository;

import com.example.carrentapp.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DiscountRepository extends JpaRepository<Discount,Long> {
}
