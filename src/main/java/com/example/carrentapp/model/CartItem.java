package com.example.carrentapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart_item")

public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="cart_id",nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "car_id",nullable = false)
    private Car car;

    @Column(name = "quantity")
    private int quantity;
}
