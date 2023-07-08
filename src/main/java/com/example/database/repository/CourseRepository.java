package com.example.database.repository;

import com.example.database.domain.CourseEntity;
import com.example.database.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAll();

    @Query(value = "SELECT COUNT(*) as total_num FROM COURSE", nativeQuery = true)
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
