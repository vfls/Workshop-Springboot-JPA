package com.cursospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
