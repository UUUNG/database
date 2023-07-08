package com.example.database.repository;

import com.example.database.domain.TwoCResult;
import com.example.database.domain.TwoDResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TwoDRepository extends JpaRepository<TwoDResult, String> {


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO BOOK (ISBN, title, year, price) VALUES (:isbn, :title, :year, :price)", nativeQuery = true)
    void insertBook(@Param("isbn") String isbn, @Param("title") String title, @Param("year") int year, @Param("price") double price);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO AUTHOR (name, address, url) VALUES (:name, :address, :url)", nativeQuery = true)
    void insertAuthor(@Param("name") String name, @Param("address") String address, @Param("url") String url);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO WRITTEN_BY (name, address, ISBN) VALUES (:name, :address, :isbn)", nativeQuery = true)
    void insertWrittenBy(@Param("name") String name, @Param("address") String address, @Param("isbn") String isbn);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO PUBLISHER (name, address, phone, url) VALUES (:name, :address, :phone, :url)", nativeQuery = true)
    void insertPublisher(@Param("name") String name, @Param("address") String address, @Param("phone") String phone, @Param("url") String url);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO PUBLISHED_BY (name, ISBN) VALUES (:name, :isbn)", nativeQuery = true)
    void insertPublishedBy(@Param("name") String name, @Param("isbn") String isbn);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO CONTAINS (basketid, ISBN, num) VALUES (:basketid, :isbn, :num)", nativeQuery = true)
    void insertContains(@Param("basketid") String basketid, @Param("isbn") String isbn, @Param("num") int num);

}
