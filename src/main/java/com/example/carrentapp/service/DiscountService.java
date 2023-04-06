package com.example.carrentapp.service;

import com.example.carrentapp.model.Discount;
import com.example.carrentapp.model.dto.DiscountDTO;
import com.example.carrentapp.repository.DiscountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiscountService {

    Discount create(DiscountDTO discountDTO);
    Discount update(DiscountDTO discountDTO);
    Discount deleteById(Long Id);
    Discount getById(Long id);
    List<Discount> getAll();

}
