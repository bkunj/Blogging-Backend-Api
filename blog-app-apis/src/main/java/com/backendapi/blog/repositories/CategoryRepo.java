package com.backendapi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendapi.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

	
}
