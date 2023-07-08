package com.example.database.repository;

import com.example.database.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM STUDENT",
            nativeQuery = true
    )
    List<StudentEntity> findAll();

    @Query(value = "SELECT COUNT(*) as total_num FROM STUDENT", nativeQuery = true)
    int getTotalCount();

//    @Modifying
//    @Transactional
//    @Query(
//            value = "INSERT INTO STUDENT(ID, NAME, DEPT_NAME, TOT_CRED) VALUES (:id, :name, :dept_name, :tot_cred)",
//            nativeQuery = true
//    )
//    void saveOne(
//            @Param("id") String id,
//            @Param("name") String name,
//            @Param("dept_name") String dept_name,
//            @Param("tot_cred") String tot_cred
//    );

}
