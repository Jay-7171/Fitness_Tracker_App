package com.fitness.tracker.controller;

import com.fitness.tracker.entity.ActivityLog;
import com.fitness.tracker.entity.User;
import com.fitness.tracker.services.ActivityLogService;
import com.fitness.tracker.services.UserService;
import com.fitness.tracker.services.impl.ActivityLogServiceImpl;
import com.fitness.tracker.services.impl.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activity_logs")
public class ActivityLogController {
    @Autowired
    private ActivityLogServiceImpl activityLogService;
    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<ActivityLog> logActivity(@Valid @RequestBody ActivityLog activityLog) {
        ActivityLog loggedActivity = activityLogService.logActivity(activityLog);
        return new ResponseEntity<>(loggedActivity, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ActivityLog>> getActivityLogsForUser(@PathVariable Long userId) {
        User user = userService.getUser(userId);
        List<ActivityLog> logs = activityLogService.getActivityLogsForUser(user);
        return new ResponseEntity<>(logs, HttpStatus.OK);
    }

    // More endpoints (update, delete)
}