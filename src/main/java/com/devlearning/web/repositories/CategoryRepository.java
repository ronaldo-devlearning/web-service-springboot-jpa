package com.devlearning.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}