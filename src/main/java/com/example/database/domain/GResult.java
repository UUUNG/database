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
public class GResult {
    @Id
    private String pdept;
    private BigDecimal lect_num;
    public GResult() {
    }

    public GResult(String pdept, BigDecimal lect_num){
        this.pdept = pdept;
        this.lect_num = lect_num;
    }
}