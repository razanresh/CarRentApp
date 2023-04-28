package com.example.carrentapp.model;

import com.example.carrentapp.model.enums.*;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String description;
    private Integer mnfYear;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Enumerated(EnumType.STRING)
    private EngineType engineType;
    private Double engineVolume;
    private Double gasPer100;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    private Boolean isAvailable;
    @OneToMany(mappedBy = "tb_price")
    private List<Price> price;
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

}
