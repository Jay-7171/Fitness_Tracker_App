package com.fitness.tracker.services.impl;

import com.fitness.tracker.entity.User;
import com.fitness.tracker.entity.WorkoutPlan;
import com.fitness.tracker.repository.WorkoutPlanRepo;
import com.fitness.tracker.services.WorkoutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkoutPlanServiceImpl implements WorkoutPlanService {
    @Autowired
    private WorkoutPlanRepo workoutPlanRepo;
    @Override
    public WorkoutPlan createWorkoutPlan(WorkoutPlan workoutPlan) {
        return this.workoutPlanRepo.save(workoutPlan);
    }

    @Override
    public List<WorkoutPlan> getWorkoutPlansForUser(User user) {
        return this.workoutPlanRepo.findByUser(user);
    }
}
