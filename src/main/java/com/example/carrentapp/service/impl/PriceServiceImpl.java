package com.example.carrentapp.service.impl;

import com.example.carrentapp.exceptions.ResourceNotFoundException;
import com.example.carrentapp.mapper.PriceMapper;
import com.example.carrentapp.model.Price;
import com.example.carrentapp.model.dto.PriceDTO;
import com.example.carrentapp.repository.PriceRepository;
import com.example.carrentapp.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;
    @Override
    public Price create(PriceDTO priceDTO) {
        Price price = priceMapper.convertToEntity(priceDTO);
        return priceRepository.save(price);
    }

    @Override
    public Price update(Long id,PriceDTO priceDTO) throws ResourceNotFoundException {
        Price existingPrice = priceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Price not found for this id :: " + id));

        Price updatedPrice = priceMapper.convertToEntity(priceDTO);
        updatedPrice.setId(existingPrice.getId());
        updatedPrice.setCar(existingPrice.getCar());

        return priceRepository.save(updatedPrice);
    }

    @Override
    public Price getById(Long id) {
        return priceRepository.findById(id).orElse(null);
    }

    @Override
    public Price deleteById(Long id) {
        Price price = getById(id);
        priceRepository.deleteById(id);
        return price;
    }

    @Override
    public List<PriceDTO> getAll() {
        List<Price> prices = priceRepository.findAll();
        List<PriceDTO> priceDTOs = new ArrayList<>();
        for (Price price: prices) {
            PriceDTO priceDTO = priceMapper.convertToDto(price);
            priceDTOs.add(priceDTO);
        }
        return priceDTOs;
    }
}
