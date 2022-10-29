package com.devlearning.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
