package edu.s21.tandraym.dndall.controllers;

import edu.s21.tandraym.dndall.entities.FileEntity;
import edu.s21.tandraym.dndall.service.FileService;
import jakarta.persistence.Access;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/api/v1/mvc/class")
public class ClassController {

    private final FileService fileService;

    @Autowired
    public ClassController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/upload-class-form")
    public String uploadForm(Model model) {
        List<FileEntity> images = fileService.getAllFiles();
        model.addAttribute("images", images);
        return "class";
    }


    @PostMapping("/upload-class-image")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        FileEntity image = new FileEntity();
        if (!file.isEmpty()) {
            try {
                image.setImage(file.getBytes());
                image.setName(file.getOriginalFilename());
                image.setImageBase64(Base64.getEncoder().encodeToString(file.getBytes()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileService.saveImage(image);
        }
        return "redirect:upload-class-form";
    }


}
