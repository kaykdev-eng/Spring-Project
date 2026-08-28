package com.projetoSpring.project.repositories;

import com.projetoSpring.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
