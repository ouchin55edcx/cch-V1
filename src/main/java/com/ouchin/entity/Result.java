package com.ouchin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.Duration;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Time is required")
    @Column(nullable = false)
    private Duration time;


    @Positive(message = "Rank must be positive")
    @Column(nullable = false)
    private Integer rank;

    @ManyToOne
    @JoinColumn(name = "cyclist_id", nullable = false)
    private Cyclist cyclist;

    @ManyToOne
    @JoinColumn(name = "phase_id", nullable = false)
    private Phase phase;
}
