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
public class TwoBResult {
    @Id
    private String title;
    private BigDecimal price;
    private String num;

    public TwoBResult() {
    }

    public TwoBResult(String title, BigDecimal price, String num) {
        this.title = title;
        this.price = price;
        this.num = num;
    }
}