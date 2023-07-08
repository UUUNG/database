package com.example.database.repository;

import com.example.database.domain.CustomerEntity;
import com.example.database.domain.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    @Modifying
    @Transactional
    @Query(
            value = "SELECT * FROM CUSTOMER",
            nativeQuery = true
    )
    List<CustomerEntity> findAll();

}
