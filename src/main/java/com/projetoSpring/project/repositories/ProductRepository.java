package com.projetoSpring.project.repositories;

import com.projetoSpring.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
