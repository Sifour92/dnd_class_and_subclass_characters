package edu.s21.tandraym.dndall.controllers;


import edu.s21.tandraym.dndall.dto.ImageDto;
import edu.s21.tandraym.dndall.entities.FileEntity;
import edu.s21.tandraym.dndall.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Base64;
import java.util.List;

@Controller
public class FileController {

    @Autowired
    private FileService fileService;

//    @GetMapping("/")
//    public String uploadForm(Model model) {
//        model.addAttribute("fileForm", new FileForm());
//        List<FileEntity> files = fileService.getAllFiles();
//        model.addAttribute("files", files);
//        return "upload";
//    }

    @GetMapping("/")
    public String uploadForm(Model model) {
        List<FileEntity> files = fileService.getAllFiles();
        model.addAttribute("files", files);
        return "upload";
    }

    /*
    Класс MultipartFile является частью Spring Framework и представляет файл,
    загруженный через HTML-форму с помощью элемента <input type="file">.
    Вот основные методы и функциональность MultipartFile:

getBytes(): Этот метод возвращает содержимое файла в виде массива байтов (byte[]).

getInputStream(): Этот метод возвращает объект InputStream, который позволяет читать содержимое файла в потоковом режиме.

getContentType(): Возвращает тип содержимого файла (например, "image/jpeg", "application/pdf" и т. д.).

getOriginalFilename(): Возвращает оригинальное имя файла, как оно было определено на стороне клиента.

getSize(): Возвращает размер файла в байтах.

Использование MultipartFile обычно включает чтение содержимого файла с помощью одного из методов (getBytes() или getInputStream()) и дальнейшую обработку этих данных в вашем приложении. В нашем примере мы использовали getBytes() для сохранения содержимого файла в базу данных в виде массива байтов.

Важно помнить, что объект MultipartFile не предоставляет непосредственного доступа к файлу на сервере. Вместо этого он предоставляет интерфейс для чтения содержимого файла и метаданных, связанных с ним.
     */

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        fileService.saveFile(file);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "redirect:/";
    }

    @GetMapping("/file/{id}")
    public String getFilePage(@PathVariable Long id, Model model) {
        FileEntity fileEntity = fileService.getFileById(id);
        String imageBase64 = Base64.getEncoder().encodeToString(fileEntity.getImage());
        model.addAttribute("imageBase64", imageBase64);
        model.addAttribute("fileName", fileEntity.getName());
        return "image"; // Имя новой HTML страницы, на которую вы хотите перейти для отображения изображения
    }
}