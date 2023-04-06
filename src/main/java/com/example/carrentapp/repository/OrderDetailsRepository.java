package com.example.carrentapp.repository;

import com.example.carrentapp.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
}
