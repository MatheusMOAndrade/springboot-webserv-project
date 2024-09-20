package com.matheusandrade.webserviceproject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusandrade.webserviceproject.entities.Order;
import com.matheusandrade.webserviceproject.entities.User;
import com.matheusandrade.webserviceproject.repositories.OrderRepository;
import com.matheusandrade.webserviceproject.repositories.UserRepository;

//configuration auxiliary class for test
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired // associate a userRepository instance with TestConfig
    private UserRepository userRepository; // dependence

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "ObiWan", "obiwan@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Padme", "padme@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
