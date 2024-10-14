package com.ouchin.entity;

import com.ouchin.entity.enums.PhaseType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "phases")
public class Phase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "Number must be positive ")
    @NotNull(message = "Number is required")
    @Column(nullable = false)
    private Integer number;

    @NotBlank(message = "Start location is required")
    @Column(name = "start_location", nullable = false)
    private String startLocation;

    @NotBlank(message = "End location is required")
    @Column(name = "end_location", nullable = false)
    private String endLocation;

    @NotNull(message = "Start time is required")
    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhaseType type;


}
