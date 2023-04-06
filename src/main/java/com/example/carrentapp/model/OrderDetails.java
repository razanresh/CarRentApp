package com.example.carrentapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_orders")

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;
    private Boolean babySeat;
    private Boolean withDriver;
    @ManyToOne
    @JoinColumn(name = "user_account_id", nullable = false)
    private UserAccount userAccount;
    private LocalDateTime dateTimeFrom;
    private LocalDateTime dateTimeTo;
    private Double priceBeforeDiscount;
    private Double priceWithDiscount;

}
