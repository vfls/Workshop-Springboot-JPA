package com.cursospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
