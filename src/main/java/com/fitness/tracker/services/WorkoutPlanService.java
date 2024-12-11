package com.fitness.tracker.services;

import com.fitness.tracker.entity.User;
import com.fitness.tracker.entity.WorkoutPlan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WorkoutPlanService {


    public WorkoutPlan createWorkoutPlan(WorkoutPlan workoutPlan);

    public List<WorkoutPlan> getWorkoutPlansForUser(User user);
}
