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
public class TwoAResult {
    @Id
    private String title;
    private BigDecimal num;

    public TwoAResult() {
    }

    public TwoAResult(String title, BigDecimal num) {
        this.title = title;
        this.num = num;
    }
}