package com.example.database.repository;

import com.example.database.domain.CourseEntity;
import com.example.database.domain.EnrollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAll();

    @Query(value = "SELECT COUNT(*) as total_num FROM ENROLL", nativeQuery = true)
    int getTotalCount();

}
