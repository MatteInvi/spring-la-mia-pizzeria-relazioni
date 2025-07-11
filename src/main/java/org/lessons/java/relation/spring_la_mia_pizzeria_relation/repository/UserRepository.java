package org.lessons.java.relation.spring_la_mia_pizzeria_relation.repository;

import java.util.Optional;

import org.lessons.java.relation.spring_la_mia_pizzeria_relation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    
}
