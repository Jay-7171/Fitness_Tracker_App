package com.fitness.tracker.repository;

import com.fitness.tracker.entity.User;
import com.fitness.tracker.entity.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutPlanRepo extends JpaRepository<WorkoutPlan,Long> {
    List<WorkoutPlan> findByUser(User user);
}
