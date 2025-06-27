package org.lessons.java.relation.spring_la_mia_pizzeria_relation.repository;

import org.lessons.java.relation.spring_la_mia_pizzeria_relation.model.Offerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferteRepository extends JpaRepository<Offerta, Integer> {
    
}
