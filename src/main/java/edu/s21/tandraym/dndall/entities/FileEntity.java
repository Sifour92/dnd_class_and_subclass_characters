package edu.s21.tandraym.dndall.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "images")
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //@Lob // Аннотация для указания, что поле должно быть сохранено как большой объект в базе данных
    private byte[] image;

    String imageBase64;


    // Getters and setters
}