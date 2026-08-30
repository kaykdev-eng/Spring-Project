package com.projetoSpring.project.repositories;

import com.projetoSpring.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
