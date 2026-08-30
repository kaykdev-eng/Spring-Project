package com.projetoSpring.project.repositories;

import com.projetoSpring.project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
