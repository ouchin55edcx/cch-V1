package com.ouchin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

@Entity
@Table(name = "cyclists")
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "The first name  is required")
    @Column(name = "last_name", nullable = false)
    private String LastName0;

    @NotBlank(message = "The last name is required")
    @Column(name = "first_name", nullable = false)
    private String FirstName;

    @NotBlank(message = "Nationaly is required")
    @Column(nullable = false)
    private String nationality;

    @NotBlank(message = "The birthay is required")
    @Past(message = "The birthay must be in the past")
    @Column(nullable = false)
    private LocalDate Birthday;

    @NotBlank(message = "The team is required")
    @Column(nullable = false)
    private String team;



}
