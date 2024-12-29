package com.devlearning.web.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devlearning.web.entities.Order;
import com.devlearning.web.entities.User;
import com.devlearning.web.entities.enums.OrderStatus;
import com.devlearning.web.repositories.OrderRepository;
import com.devlearning.web.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brown", "maria@gmail.com", "99999999", "12345");
		User u2 = new User(null,"Alex Green", "alex@gmail.com", "98888888", "12345");
		
		Order o1 = new Order(null, Instant.parse("2022-10-30T16:11:00Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-11-30T19:23:05Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-10-30T13:56:15Z"), OrderStatus.WAITING_PAYMENT, u1);		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}
}
