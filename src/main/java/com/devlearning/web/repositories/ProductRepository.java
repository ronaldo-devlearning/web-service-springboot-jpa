package com.devlearning.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
