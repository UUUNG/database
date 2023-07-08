package com.example.database.repository;

import com.example.database.domain.BResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BRepository extends JpaRepository<BResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT C.cname, E.grade, E.exam FROM STUDENT S JOIN ENROLL E ON S.sno = E.sno JOIN COURSE C ON E.cno = C.cno WHERE S.sno = :sno",
            nativeQuery = true
    )
    List<Object[]> findCourseGradeAndExamById(@Param("sno") BigDecimal sno);
}
