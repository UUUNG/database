package com.example.database.repository;

import com.example.database.domain.BResult;
import com.example.database.domain.DResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface DRepository extends JpaRepository<DResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT C.cname, MAX(E.exam) AS max_score, MIN(E.exam) AS min_score, S.sno, S.sname\n" +
                    "FROM COURSE C\n" +
                    "JOIN ENROLL E ON C.cno = E.cno\n" +
                    "JOIN STUDENT S ON E.sno = S.sno\n" +
                    "GROUP BY C.cname, S.sno, S.sname",
            nativeQuery = true
    )
    List<Object[]> findResult();
}
