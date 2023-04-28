package com.example.carrentapp.repository;

import com.example.carrentapp.model.OrderDetails;
import com.example.carrentapp.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
    OrderDetails findByUserAccount(UserAccount userAccount);
    List<OrderDetails> findAllByCarsCostBetween(Double a, Double b);
}
