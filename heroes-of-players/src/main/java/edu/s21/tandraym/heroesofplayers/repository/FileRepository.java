package edu.s21.tandraym.heroesofplayers.repository;

import edu.s21.tandraym.heroesofplayers.entities.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
