package com.fitness.tracker.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
@Entity
public class ActivityLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // The user who performed the activity

    @ManyToOne
    @JoinColumn(name = "workout_plan_id")
    private WorkoutPlan workoutPlan; // The associated workout plan

    @NotNull
    private LocalDate date;

    @NotNull
    private Integer durationInMinutes; // Duration of the activity in minutes

    @NotNull
    private String activityType; // Type of activity (e.g., Running, Cycling)

    // Getters and Setters
}
