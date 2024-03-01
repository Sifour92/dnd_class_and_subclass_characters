package edu.s21.tandraym.dndall.service;

import edu.s21.tandraym.dndall.entities.FileEntity;
import edu.s21.tandraym.dndall.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public void saveFile(MultipartFile file) {
        try {
            FileEntity fileEntity = new FileEntity();
            fileEntity.setName(file.getOriginalFilename());

//            byte[] bytes = file.getBytes();
//            ByteArrayOutputStream bis = new ByteArrayOutputStream();
//            ImageIO.write(ImageIO.read(new ByteArrayInputStream(bytes)), "png", bis);
//            fileEntity.setImage(bis.toByteArray());
            fileEntity.setImage(file.getBytes()); // Сохраняем содержимое файла

            fileRepository.save(fileEntity);
        } catch (IOException e) {
            // Обработка ошибок
            e.printStackTrace();
        }
    }

    public List<FileEntity> getAllFiles() {
        return fileRepository.findAll();
    }

    public FileEntity getFileById(Long id) {
        return fileRepository.findById(id).orElse(null);
    }

    public FileEntity saveImage(FileEntity fileEntity) {
        return fileRepository.save(fileEntity);
    }
}