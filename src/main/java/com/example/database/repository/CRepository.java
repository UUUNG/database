package com.example.database.repository;

import com.example.database.domain.CResult;
import com.example.database.domain.EResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CRepository extends JpaRepository<CResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT S.sname, S.sno, E.cno\n" +
                    "FROM STUDENT S\n" +
                    "JOIN ENROLL E ON S.sno = E.sno\n" +
                    "WHERE (E.grade = 'F' AND E.exam >= 60)\n" +
                    "   OR (E.grade = 'D' AND (E.exam < 60 OR E.exam >= 70))\n" +
                    "   OR (E.grade = 'C' AND (E.exam < 70 OR E.exam >= 80))\n" +
                    "   OR (E.grade = 'B' AND (E.exam < 80 OR E.exam >= 90))\n" +
                    "   OR (E.grade = 'A' AND E.exam < 90)",
            nativeQuery = true
    )
    List<Object[]> findResult();

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE ENROLL\n" +
            "SET grade = CASE\n" +
            "    WHEN grade = 'F' AND exam >= 60 THEN 'D'\n" +
            "    WHEN grade = 'D' AND (exam < 60 OR exam >= 70) THEN 'C'\n" +
            "    WHEN grade = 'C' AND (exam < 70 OR exam >= 80) THEN 'B'\n" +
            "    WHEN grade = 'B' AND (exam < 80 OR exam >= 90) THEN 'A'\n" +
            "    WHEN grade = 'A' AND exam < 90 THEN 'A'\n" +
            "    ELSE grade\n" +
            "    END\n" +
            "WHERE (grade = 'F' AND exam >= 60)\n" +
            "   OR (grade = 'D' AND (exam < 60 OR exam >= 70))\n" +
            "   OR (grade = 'C' AND (exam < 70 OR exam >= 80))\n" +
            "   OR (grade = 'B' AND (exam < 80 OR exam >= 90))\n" +
            "   OR (grade = 'A' AND exam < 90)",
            nativeQuery = true
    )
    void updateResult();
}
