package com.example.database.repository;

import com.example.database.domain.TwoFResult;
import com.example.database.domain.TwoGResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoGRepository extends JpaRepository<TwoGResult, String> {


    @Modifying
    @Transactional
    @Query(
            value = "SELECT DISTINCT b.isbn, b.title, b.year,\n" +
                    "    CASE\n" +
                    "        WHEN c.num > :num THEN b.price * 0.9\n" +
                    "        ELSE b.price\n" +
                    "    END AS price\n" +
                    "FROM book b\n" +
                    "JOIN contains c ON b.isbn = c.isbn\n" +
                    "WHERE c.num > :num",
            nativeQuery = true
    )
    List<TwoGResult> findBookByNum(@Param("num") String num);
}
