package com.devlearning.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
