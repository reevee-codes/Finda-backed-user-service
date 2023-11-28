package com.finda.config;

import com.finda.model.User;
import com.finda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import static com.finda.model.Role.OWNER;


@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Value("${admin.username}")
    private String adminUsername;

    @Value("${admin.password}")
    private String adminPassword;

    @Value("${admin.email}")
    private String adminEmail;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String...args) throws Exception {
//        User admin = new User(0L, null, adminUsername, adminEmail, OWNER, passwordEncoder.encode(adminPassword));
//        userRepository.save(admin);
    }
}