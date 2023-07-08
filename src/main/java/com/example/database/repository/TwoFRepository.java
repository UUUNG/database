package com.example.database.repository;

import com.example.database.domain.TwoEResult;
import com.example.database.domain.TwoFResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoFRepository extends JpaRepository<TwoFResult, String> {


    @Modifying
    @Transactional
    @Query(
            value = "SELECT\n" +
                    "    WB.name AS author_name,\n" +
                    "    COUNT(B.ISBN) AS book_count,\n" +
                    "    MAX(B.price) AS max_price,\n" +
                    "    MIN(B.price) AS min_price,\n" +
                    "    AVG(B.price) AS average_price\n" +
                    "FROM\n" +
                    "    WRITTEN_BY WB\n" +
                    "JOIN\n" +
                    "    BOOK B ON WB.ISBN = B.ISBN\n" +
                    "GROUP BY\n" +
                    "    WB.name\n",
            nativeQuery = true
    )
    List<TwoFResult> findAll();
}
