package edu.s21.tandraym.heroesofplayers.controllers;

import edu.s21.tandraym.heroesofplayers.repository.SubclassFeatureRepository;
import edu.s21.tandraym.heroesofplayers.repository.SubclassRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/mvc/subclass")
public class SubclassController {

    @Autowired
    SubclassRepository subclassRepository;

    @Autowired
    SubclassFeatureRepository subclassFeatureRepository;


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message","Hello");
        return "hello";
    }

    @GetMapping("/all")
    public String getAllSubclasses(Model model) {
        model.addAttribute("subclasses", subclassRepository.findAll());
        return "subclasses";
    }
    }