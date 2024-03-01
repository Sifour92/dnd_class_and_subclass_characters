package edu.s21.tandraym.dndall.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.Base64;

@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class ImageDto {

    private Long id;

    private String name;

    String imageBase64;
}
