package edu.s21.tandraym.heroesofplayers.repository;

import edu.s21.tandraym.heroesofplayers.entities.SubClassFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubclassFeatureRepository extends JpaRepository<SubClassFeature, Integer> {

}
