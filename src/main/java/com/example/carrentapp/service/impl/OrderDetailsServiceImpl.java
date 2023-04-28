package com.example.carrentapp.service.impl;

import com.example.carrentapp.model.OrderDetails;
import com.example.carrentapp.model.UserAccount;
import com.example.carrentapp.model.dto.OrderDetailsDTO;
import com.example.carrentapp.repository.OrderDetailsRepository;
import com.example.carrentapp.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {
    private final CartService cartSerivice;
    private final PriceService priceService;
    private final DiscountService discountService;
    private final OrderDetailsRepository orderDetailsRepository;

    private UserAccountService userAccountService;
    @Override
    public OrderDetails create(String login, OrderDetailsDTO orderDetailsDTO) {
        UserAccount userAccount = userAccountService.getByLogin(login);
        if(userAccount == null) return null;

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setUserAccount(userAccount);
        orderDetails.setOrderedCarList(orderDetailsDTO.getOrderedCarList());

        Double carsCost = 0.0;
        for(OrderedCar o : orderDetailsDTO.getOrderedCarList()){
            Double discountPrice = o.getCar().getPrice() - (o.getCar().getPrice() * getDiscount() / 100);
        }

        return orderDetails;
    }

    @Override
    public OrderDetails deleteById(Long id) {
        OrderDetails orderDetails = getById(id);
        orderDetailsRepository.deleteById(id);

        return orderDetails;
    }

    @Override
    public OrderDetails getById(Long id) {
        return orderDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public List<OrderDetails> getAll() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public OrderDetails getByLogin(String login) {
        UserAccount userAccount = userAccountService.getByLogin(login);
        return orderDetailsRepository.findByUserAccount(userAccount);
    }

    @Override
    public List<OrderDetails> getAllByCarsCostBetween(Double a, Double b) {
        return orderDetailsRepository.findAllByCarsCostBetween(a, b);
    }
}
