package com.example.database.repository;

import com.example.database.domain.EResult;
import com.example.database.domain.FResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface FRepository extends JpaRepository<FResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT C.cname,\n" +
                    "    CASE\n" +
                    "        WHEN AVG(E.exam) IS NULL THEN '알 수 없음'\n" +
                    "        ELSE TO_CHAR(AVG(E.exam))\n" +
                    "    END AS average_exam_score,\n" +
                    "    COUNT(CASE WHEN E.grade = 'A' THEN E.sno END) AS grade_a,\n" +
                    "    COUNT(CASE WHEN E.grade = 'B' THEN E.sno END) AS grade_b,\n" +
                    "    COUNT(CASE WHEN E.grade = 'C' THEN E.sno END) AS grade_c,\n" +
                    "    COUNT(CASE WHEN E.grade = 'D' THEN E.sno END) AS grade_d,\n" +
                    "    COUNT(CASE WHEN E.grade = 'F' THEN E.sno END) AS grade_f\n" +
                    "FROM COURSE C\n" +
                    "LEFT JOIN ENROLL E ON C.cno = E.cno\n" +
                    "GROUP BY C.cname",
            nativeQuery = true
    )
    List<Object[]> findResult();
}
