package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@RequiredArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String color;
    @NonNull
    private String registrationNumber;
    @NonNull
    private int modelYear;
    @NonNull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")     // 컬럼명을 제작
    @NonNull
    private Owner owner;
}

