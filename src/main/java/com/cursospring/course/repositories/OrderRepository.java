package com.cursospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
