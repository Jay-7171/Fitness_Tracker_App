package com.fitness.tracker.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // The user who owns the workout plan

    // Getters and Setters
}