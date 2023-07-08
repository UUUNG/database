package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BOOK")
@Builder
@Getter
@Setter
public class BookEntity {
    @Id
    @Column(name = "ISBN")
    private String isbn;

    @Column(name="TITLE")
    private String title;

    @Column(name="YEAR")
    private String year;

    @Column(name="PRICE")
    private String price;
}
