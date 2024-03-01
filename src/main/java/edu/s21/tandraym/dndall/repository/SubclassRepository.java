package edu.s21.tandraym.dndall.repository;

import edu.s21.tandraym.dndall.entities.Subclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubclassRepository extends JpaRepository<Subclass, Integer> {

//    @Query("SELECT s FROM Subclass s JOIN FETCH s.features scf ON s.name = scf.subclass.name")
//@Query(value = "SELECT * FROM subclasses JOIN features ON subclasses.name = features.subclass_name", nativeQuery = true)
//List<Subclass> findAllWithSubClassFeatures();

}
