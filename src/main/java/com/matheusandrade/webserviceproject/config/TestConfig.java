package com.matheusandrade.webserviceproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusandrade.webserviceproject.entities.User;
import com.matheusandrade.webserviceproject.repositories.UserRepository;

//configuration auxiliary class for test
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //associate a userRepository instance with TestConfig
    private UserRepository userRepository; //dependence

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "ObiWan", "obiwan@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Padme", "padme@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
    
}
