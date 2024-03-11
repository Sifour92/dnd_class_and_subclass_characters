package edu.s21.tandraym.heroesofplayers.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "features")
public class SubClassFeature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subclass_name", referencedColumnName = "name")
    @JsonBackReference
    private Subclass subclass;

    @Column(name = "subclass_feature_name")
    private String featureName;

    @Column(name = "subclass_feature_lvl")
    private Integer featureLevel;

    @Column
    private String description;

}