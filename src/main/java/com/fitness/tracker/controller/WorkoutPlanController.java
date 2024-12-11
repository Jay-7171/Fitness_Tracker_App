package com.fitness.tracker.controller;

import com.fitness.tracker.entity.User;
import com.fitness.tracker.entity.WorkoutPlan;
import com.fitness.tracker.services.UserService;
import com.fitness.tracker.services.WorkoutPlanService;
import com.fitness.tracker.services.impl.UserServiceImpl;
import com.fitness.tracker.services.impl.WorkoutPlanServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workout_plans")
public class WorkoutPlanController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private WorkoutPlanServiceImpl workoutPlanService;

    @PostMapping
    public ResponseEntity<WorkoutPlan> createWorkoutPlan(@Valid @RequestBody WorkoutPlan workoutPlan) {
        WorkoutPlan createdPlan = workoutPlanService.createWorkoutPlan(workoutPlan);
        return new ResponseEntity<>(createdPlan, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<WorkoutPlan>> getWorkoutPlansForUser(@PathVariable Long userId) {
        User user = userService.getUser(userId);
        List<WorkoutPlan> plans = workoutPlanService.getWorkoutPlansForUser(user);
        return new ResponseEntity<>(plans, HttpStatus.OK);
    }

}
