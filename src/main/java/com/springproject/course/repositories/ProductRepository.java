package com.springproject.course.repositories;

import com.springproject.course.entities.Category;
import com.springproject.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
