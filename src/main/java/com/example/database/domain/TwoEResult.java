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
public class TwoEResult {
    @Id
    private BigDecimal year;
    private BigDecimal average_price;
    private BigDecimal overall_average_price;

    public TwoEResult() {
    }

    public TwoEResult(BigDecimal year, BigDecimal average_price, BigDecimal overall_average_price) {
        this.year = year;
        this.average_price = average_price;
        this.overall_average_price = overall_average_price;
    }
}