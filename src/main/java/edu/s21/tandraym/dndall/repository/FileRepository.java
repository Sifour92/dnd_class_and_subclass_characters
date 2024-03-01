package edu.s21.tandraym.dndall.repository;

import edu.s21.tandraym.dndall.entities.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
