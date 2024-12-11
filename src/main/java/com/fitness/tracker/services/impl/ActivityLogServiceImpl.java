package com.fitness.tracker.services.impl;

import com.fitness.tracker.entity.ActivityLog;
import com.fitness.tracker.entity.User;
import com.fitness.tracker.repository.ActivityLogRepo;
import com.fitness.tracker.services.ActivityLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityLogServiceImpl implements ActivityLogService {
    @Autowired
    private ActivityLogRepo activityLogRepo;
    @Override
    public ActivityLog logActivity(ActivityLog activityLog) {
        return activityLogRepo.save(activityLog);
    }

    @Override
    public List<ActivityLog> getActivityLogsForUser(User user) {
         return activityLogRepo.findByUser(user);
    }
}
