package com.example.carrentapp.service;

import com.example.carrentapp.model.OrderDetails;
import com.example.carrentapp.model.dto.OrderDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface OrderDetailsService {
    OrderDetails create(String login, OrderDetailsDTO orderDetailsDTO);
    OrderDetails deleteById(Long id);
    OrderDetails getById(Long Id);
    List<OrderDetails> getAll();
    OrderDetails getByLogin(String login);
}
