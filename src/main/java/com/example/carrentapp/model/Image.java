package com.example.carrentapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_name", nullable = false)
    private String name;

    @Column(name = "image_format" ,nullable = false)
    private String format;

    @Column(name = "image_url", nullable = false)
    private String url;
}
