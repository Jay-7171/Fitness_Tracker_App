package com.fitness.tracker.services;

import com.fitness.tracker.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public User createUser(User user);
    public User getUser(long id);
    public String deleteUser(long id);
}
