package com.example.database.repository;

import com.example.database.domain.TwoBResult;
import com.example.database.domain.TwoCResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoCRepository extends JpaRepository<TwoCResult, String> {


    @Modifying
    @Transactional
    @Query(
            value = "SELECT C.name AS customer_name, B.title AS book_title, P.name AS publisher_name, A.name, A.address, A.url\n" +
                    "FROM CUSTOMER C\n" +
                    "JOIN BASKET_OF BO ON C.email = BO.email\n" +
                    "JOIN CONTAINS CNT ON BO.basketid = CNT.basketid\n" +
                    "JOIN BOOK B ON CNT.ISBN = B.ISBN\n" +
                    "LEFT JOIN PUBLISHED_BY PB ON B.ISBN = PB.ISBN\n" +
                    "LEFT JOIN PUBLISHER P ON PB.name = P.name\n" +
                    "JOIN WRITTEN_BY WB ON B.ISBN = WB.ISBN\n" +
                    "JOIN AUTHOR A ON WB.name = A.name AND WB.address = A.address\n" +
                    "WHERE C.email = :email\n",
            nativeQuery = true
    )
    List<Object[]> findCustomerByEmail(@Param("email") String email);
}
