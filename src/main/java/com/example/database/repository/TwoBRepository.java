package com.example.database.repository;

import com.example.database.domain.TwoBResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface TwoBRepository extends JpaRepository<TwoBResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT * FROM PUBLISHER",
            nativeQuery = true
    )
    List<TwoBResult> findAll();

    @Modifying
    @Transactional
    @Query(
            value = "SELECT B.title, B.price,\n" +
                    "    CASE\n" +
                    "        WHEN SUM(S.num) = 0 THEN '재고없음'\n" +
                    "        ELSE CAST(SUM(S.num) AS VARCHAR(10))\n" +
                    "    END AS total_num\n" +
                    "FROM PUBLISHED_BY PB\n" +
                    "JOIN BOOK B ON PB.ISBN = B.ISBN\n" +
                    "LEFT JOIN STOCKS S ON B.ISBN = S.ISBN \n" +
                    "WHERE PB.name = :name\n" +
                    "GROUP BY B.title, B.price",
            nativeQuery = true
    )
    List<Object[]> findPublisherByName(@Param("name") String name);
}
