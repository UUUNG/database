package com.example.database.repository;

import com.example.database.domain.EnrollEntity;
import com.example.database.domain.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface ProfessoRepository extends JpaRepository<ProfessorEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM PROFESSOR",
            nativeQuery = true
    )
    List<ProfessorEntity> findAll();

    @Query(value = "SELECT COUNT(*) as total_num FROM PROFESSOR", nativeQuery = true)
    int getTotalCount();

}
