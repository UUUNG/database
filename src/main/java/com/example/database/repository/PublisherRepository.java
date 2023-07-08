package com.example.database.repository;

import com.example.database.domain.PublisherEntity;
import com.example.database.domain.TwoBResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT * FROM PUBLISHER",
            nativeQuery = true
    )
    List<PublisherEntity> findAll();

}
