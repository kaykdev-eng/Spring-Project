package com.projetoSpring.project.config;

import com.projetoSpring.project.entities.User;
import com.projetoSpring.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Kayk magalhaes", "Kayk@gmail.com", "71996252426", "1234455");
        User u2 = new User(null, "Eduarda Barroso", "Eduarda@gmail.com", "7191231312", "15555");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
