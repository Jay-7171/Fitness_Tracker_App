package com.fitness.tracker.services;

import com.fitness.tracker.entity.ActivityLog;
import com.fitness.tracker.entity.User;
import com.fitness.tracker.repository.ActivityLogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ActivityLogService {
    public ActivityLog logActivity(ActivityLog activityLog);
    public List<ActivityLog> getActivityLogsForUser(User user);

}
