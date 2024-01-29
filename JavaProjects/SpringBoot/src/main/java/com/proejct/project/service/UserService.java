package com.proejct.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proejct.project.entity.User;
import com.proejct.project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;
    public List<User> getUsers() {
        return userRepo.findAll();
    }
    public User registerUser(User user) {
        return userRepo.save(user);
    }
    public User getUserById(Long id) {
        return userRepo.findById(id)
            .orElseThrow();
    }
    public void removeUserById(Long id) {
        userRepo.deleteById(id);
    }
}
