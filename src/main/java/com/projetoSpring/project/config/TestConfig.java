package com.projetoSpring.project.config;

import com.projetoSpring.project.entities.Category;
import com.projetoSpring.project.entities.Order;
import com.projetoSpring.project.entities.User;
import com.projetoSpring.project.entities.enums.OrderStatus;
import com.projetoSpring.project.repositories.CategoryRepository;
import com.projetoSpring.project.repositories.OrderRepository;
import com.projetoSpring.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Kayk magalhaes", "Kayk@gmail.com", "71996252426", "1234455");
        User u2 = new User(null, "Eduarda Barroso", "Eduarda@gmail.com", "7191231312", "15555");

        Order o1 = new Order(null, Instant.parse("2026-07-20T19:53:09Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2026-04-19T15:53:09Z"), OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2026-10-15T18:53:09Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
