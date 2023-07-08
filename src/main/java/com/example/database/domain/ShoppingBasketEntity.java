package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "SHOPPING_BASKET")
@Builder
@Getter
@Setter
public class ShoppingBasketEntity {
    @Id
    @Column(name = "BASKETID")
    private String basketid;
}
