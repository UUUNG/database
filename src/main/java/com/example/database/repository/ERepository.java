package com.example.database.repository;

import com.example.database.domain.DResult;
import com.example.database.domain.EResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ERepository extends JpaRepository<EResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT S.sno, S.sname, SUM(C.credit) AS total_credits, AVG(E.exam) AS average_exam_score\n" +
                    "FROM STUDENT S\n" +
                    "JOIN ENROLL E ON S.sno = E.sno\n" +
                    "JOIN COURSE C ON E.cno = C.cno\n" +
                    "GROUP BY S.sno, S.sname\n",
            nativeQuery = true
    )
    List<Object[]> findResult();
}
