package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BASKET_OF")
@Builder
@Getter
@Setter
public class BasketOfEntity {
    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BASKETID")
    private String basketid;
}
