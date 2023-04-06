package com.example.carrentapp.service;

import com.example.carrentapp.model.Price;
import com.example.carrentapp.model.dto.PriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PriceService {
    Price create(PriceDTO priceDTO);
    Price update(PriceDTO priceDTO);
    Price getById(Long id);
    Price deleteById(Long id);
    List<PriceDTO>getAll();

}
