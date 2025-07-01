package org.lessons.java.relation.spring_la_mia_pizzeria_relation.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "ingredienti")
public class Ingrediente {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotBlank (message = "Il nome dell'ingrediente non può essere vuoto!")
    private String nome;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
