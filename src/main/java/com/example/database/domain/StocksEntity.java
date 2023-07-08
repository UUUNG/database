package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "STOCKS")
@Builder
@Getter
@Setter
public class StocksEntity {
    @Id
    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "CODE")
    private String code;

    @Column(name="NUM")
    private String num;
}
