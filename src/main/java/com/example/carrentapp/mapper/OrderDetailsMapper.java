package com.example.carrentapp.mapper;

import com.example.carrentapp.model.OrderDetails;
import com.example.carrentapp.model.Price;
import com.example.carrentapp.model.dto.OrderDetailsDTO;
import com.example.carrentapp.model.dto.PriceDTO;

public interface OrderDetailsMapper {
    OrderDetails toEntity(OrderDetailsDTO orderDetailsDTO);
    OrderDetailsDTO toDto(OrderDetails orderDetails);

}
