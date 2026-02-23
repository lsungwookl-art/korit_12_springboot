package com.example.cardatabase00.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nonnull
    private String brand;
    @Nonnull
    private String model;
    @Nonnull
    private String color;
    @Nonnull
    private String registrationNumber;
    @Nonnull
    private int modelYear;
    @Nonnull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    @Nonnull
    private Owner owner;

}
