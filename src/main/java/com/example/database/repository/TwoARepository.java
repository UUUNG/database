package com.example.database.repository;

import com.example.database.domain.TwoAResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoARepository extends JpaRepository<TwoAResult, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT b.title, SUM(s.num)\n" +
                    "FROM BOOK b\n" +
                    "JOIN WRITTEN_BY wb ON b.ISBN = wb.ISBN\n" +
                    "JOIN STOCKS s ON b.ISBN = s.ISBN\n" +
                    "WHERE wb.name = :name\n" +
                    "  AND wb.address = :address\n" +
                    "GROUP BY  b.title",
            nativeQuery = true
    )
    List<Object[]> findResult(
            @Param("name") String name,
            @Param("address") String address
    );
}
