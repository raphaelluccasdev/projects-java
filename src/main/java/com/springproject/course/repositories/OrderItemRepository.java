package com.springproject.course.repositories;

import com.springproject.course.entities.OrderItem;
import com.springproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
