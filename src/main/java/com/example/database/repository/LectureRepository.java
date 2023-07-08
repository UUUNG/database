package com.example.database.repository;

import com.example.database.domain.LectureEntity;
import com.example.database.domain.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface LectureRepository extends JpaRepository<LectureEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM LECTURE",
            nativeQuery = true
    )
    List<LectureEntity> findAll();

    @Query(value = "SELECT COUNT(*) as total_num FROM LECTURE", nativeQuery = true)
    int getTotalCount();

}
