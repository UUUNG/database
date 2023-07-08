package com.example.database.repository;

import com.example.database.domain.TwoCResult;
import com.example.database.domain.TwoEResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoERepository extends JpaRepository<TwoEResult, String> {


    @Modifying
    @Transactional
    @Query(
            value = "SELECT year, AVG(price) AS average_price,\n" +
                    "(SELECT AVG(price) FROM BOOK) As overall_average_price\n" +
                    "FROM BOOK\n" +
                    "GROUP BY year",
            nativeQuery = true
    )
    List<TwoEResult> findAll();
}
