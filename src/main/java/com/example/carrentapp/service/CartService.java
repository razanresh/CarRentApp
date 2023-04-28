package com.example.carrentapp.service;

import com.example.carrentapp.model.Cart;
import com.example.carrentapp.model.UserAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    Cart create(Cart cart);
    Cart deleteById(Long id);
    Cart getById(Long id);
    List<Cart> getAll();

    Cart getByUserAccount(UserAccount userAccount);
}
