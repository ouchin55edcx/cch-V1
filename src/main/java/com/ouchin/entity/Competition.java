package com.ouchin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.Duration;
import java.time.LocalDate;

@Entity
@Table(name = "competitions")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Date is required ")
    @Column(nullable = false)
    private LocalDate date;

    @NotBlank(message = "Location is required")
    @Column(nullable = false)
    private String location;

    @NotBlank(message = "Duration is required ")
    @Column(nullable = false)
    private Duration duration;



}
