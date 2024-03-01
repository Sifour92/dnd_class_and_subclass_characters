package edu.s21.tandraym.dndall.controllers;

import edu.s21.tandraym.dndall.entities.Subclass;
import edu.s21.tandraym.dndall.repository.SubclassFeatureRepository;
import edu.s21.tandraym.dndall.repository.SubclassRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("Контроллер для сабкласса")
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/rest/subclass")
public class SubclassControllerRest {

    @Autowired

    SubclassRepository subclassRepository;

    @Autowired
    SubclassFeatureRepository subclassFeatureRepository;

    @GetMapping("/all")
    public List<Subclass> getAllSubclasses() {
        List<Subclass> subclasses = subclassRepository.findAll();
        return subclasses;
    }
}
