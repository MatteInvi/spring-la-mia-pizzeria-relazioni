package org.lessons.java.relation.spring_la_mia_pizzeria_relation.controller;

import org.lessons.java.relation.spring_la_mia_pizzeria_relation.repository.IngredientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredienti")
public class IngredienteController {

    @Autowired
    IngredientiRepository ingredientiRepository;

    @GetMapping
    public String index(Model model){

        model.addAttribute("ingredienti", ingredientiRepository.findAll());
        return"ingredienti/index";
    }    
}
