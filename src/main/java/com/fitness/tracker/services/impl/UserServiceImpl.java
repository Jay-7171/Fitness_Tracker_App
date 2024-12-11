package com.fitness.tracker.services.impl;

import com.fitness.tracker.entity.User;
import com.fitness.tracker.repository.UserRepo;
import com.fitness.tracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(long id) {
        return this.userRepo.findById(id).orElseThrow(()-> new RuntimeException("User Not available"));
    }

    @Override
    public String deleteUser(long id) {
         User user=this.userRepo.findById(id).orElseThrow(()-> new RuntimeException("User Not available"));
         this.userRepo.delete(user);
         return "User deleted Successfully";
    }
}
