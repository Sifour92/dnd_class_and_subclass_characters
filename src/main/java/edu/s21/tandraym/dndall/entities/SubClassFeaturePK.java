package edu.s21.tandraym.dndall.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@ToString
@EqualsAndHashCode
public class SubClassFeaturePK implements Serializable {
    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "name", insertable = false, updatable = false) // Добавляем insertable и updatable
//    private Subclass subclass;

    @Column(name = "subclass_name")
    private String subclassName;

    @Column(name = "subclass_feature_name")
    private String featureName;
}
