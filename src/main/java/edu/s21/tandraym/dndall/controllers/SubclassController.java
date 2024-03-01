package edu.s21.tandraym.dndall.controllers;

import edu.s21.tandraym.dndall.entities.Subclass;
import edu.s21.tandraym.dndall.repository.SubclassFeatureRepository;
import edu.s21.tandraym.dndall.repository.SubclassRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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