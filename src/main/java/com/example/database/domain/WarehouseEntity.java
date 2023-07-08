package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WAREHOUSE")
@Builder
@Getter
@Setter
public class WarehouseEntity {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name="PHONE")
    private String phone;
}
