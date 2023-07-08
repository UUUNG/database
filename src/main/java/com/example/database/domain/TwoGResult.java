package com.example.database.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Builder
@Entity
@Getter
@Setter
public class TwoGResult {
    @Id
    private String isbn;
    private String title;
    private BigDecimal year;
    private BigDecimal price;

    public TwoGResult() {
    }

    public TwoGResult(String isbn, String title, BigDecimal year, BigDecimal price) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }
}