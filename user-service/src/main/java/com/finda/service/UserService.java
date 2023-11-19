package com.finda.service;

import com.finda.model.Dupa;
import com.finda.model.User;
import com.finda.repository.DupaRepository;
import com.finda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DupaRepository dupaRepository;

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }


    public Dupa createDupa(Dupa dupa) {
        return dupaRepository.save(dupa);
    }


    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Dupa> getAllDupy() {
        return dupaRepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update user
    public User updateUser(Long id, User userDetails) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setName(userDetails.getName());
            existingUser.setEmail(userDetails.getEmail());
            return userRepository.save(existingUser);
        }
        return null;
    }

    // Delete all users
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<Dupa> getDupaById(Long id) {
        return dupaRepository.findById(id);
    }

    // Other business logic related to users
}