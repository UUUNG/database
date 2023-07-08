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
public class TwoFResult {
    @Id
    private String author_name;
    private BigDecimal book_count;
    private BigDecimal max_price;
    private BigDecimal min_price;
    private BigDecimal average_price;

    public TwoFResult() {
    }

    public TwoFResult(String author_name, BigDecimal book_count, BigDecimal max_price, BigDecimal min_price, BigDecimal average_price) {
        this.author_name = author_name;
        this.book_count = book_count;
        this.max_price = max_price;
        this.min_price = min_price;
        this.average_price = average_price;
    }
}