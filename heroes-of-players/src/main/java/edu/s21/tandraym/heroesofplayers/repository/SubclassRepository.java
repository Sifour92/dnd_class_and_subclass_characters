package edu.s21.tandraym.heroesofplayers.repository;

import edu.s21.tandraym.heroesofplayers.entities.Subclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubclassRepository extends JpaRepository<Subclass, Integer> {

//    @Query("SELECT s FROM Subclass s JOIN FETCH s.features scf ON s.name = scf.subclass.name")
//@Query(value = "SELECT * FROM subclasses JOIN features ON subclasses.name = features.subclass_name", nativeQuery = true)
//List<Subclass> findAllWithSubClassFeatures();

}
