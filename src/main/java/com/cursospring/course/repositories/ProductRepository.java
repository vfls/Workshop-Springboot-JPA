package com.cursospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
