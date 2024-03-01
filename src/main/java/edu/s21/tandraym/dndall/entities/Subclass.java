package edu.s21.tandraym.dndall.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "subclasses")
public class Subclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;


    @OneToMany(mappedBy = "subclass", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private List<SubClassFeature> features;
}

