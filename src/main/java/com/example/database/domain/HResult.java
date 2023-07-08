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
public class HResult {
    @Id
    private String dept;
    private String year;
    private BigDecimal total_num;
    public HResult() {
    }

    public HResult(String dept, String year, BigDecimal total_num){
        this.dept = dept;
        this.year = year;
        this.total_num = total_num;
    }
}