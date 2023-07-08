package com.example.database.repository;

import com.example.database.domain.GResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface GRepository extends JpaRepository<GResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT P.pdept,\n" +
                    "       COUNT(*)\n" +
                    "FROM LECTURE L\n" +
                    "JOIN PROFESSOR P ON L.pno = P.pno\n" +
                    "GROUP BY P.pdept",
            nativeQuery = true
    )
    List<Object[]> findResult();
}
