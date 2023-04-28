package com.example.carrentapp.service;

import com.example.carrentapp.model.CartItem;
import com.example.carrentapp.model.dto.CartItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartItemService {
    CartItem create(String login, CartItemDTO cartItemDTO);
    CartItem deleteById(String login, Long id);
    CartItem getById(Long id);
    List<CartItem> getAll();

    List<CartItem> getAllMine(String login);
}
