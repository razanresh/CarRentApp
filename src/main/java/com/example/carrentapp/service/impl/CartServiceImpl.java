package com.example.carrentapp.service.impl;

import com.example.carrentapp.model.Cart;
import com.example.carrentapp.model.UserAccount;
import com.example.carrentapp.repository.CartRepository;
import com.example.carrentapp.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    @Override
    public Cart create(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart deleteById(Long id) {
        Cart cart = getById(id);
        cartRepository.deleteById(id);
        return cart;
    }

    @Override
    public Cart getById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getByUserAccount(UserAccount userAccount) {
        return cartRepository.findByUserAccount(userAccount);
    }
}
