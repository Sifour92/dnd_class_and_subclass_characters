package edu.s21.tandraym.dndall.repository;

import edu.s21.tandraym.dndall.entities.SubClassFeature;
import edu.s21.tandraym.dndall.entities.SubClassFeaturePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubclassFeatureRepository extends JpaRepository<SubClassFeature, Integer> {

}
