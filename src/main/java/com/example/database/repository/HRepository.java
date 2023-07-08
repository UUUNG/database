package com.example.database.repository;

import com.example.database.domain.GResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface HRepository extends JpaRepository<GResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT dept,\n" +
                    "       year,\n" +
                    "       COUNT(*)\n" +
                    "FROM STUDENT\n" +
                    "GROUP BY dept, year",
            nativeQuery = true
    )
    List<Object[]> findResult();
}
