package com.fitness.tracker.repository;

import com.fitness.tracker.entity.ActivityLog;
import com.fitness.tracker.entity.User;
import com.fitness.tracker.entity.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityLogRepo extends JpaRepository<ActivityLog,Long> {
    List<ActivityLog> findByUser(User user);
    List<ActivityLog> findByWorkoutPlan(WorkoutPlan workoutPlan);
}
