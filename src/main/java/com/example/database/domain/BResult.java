package com.example.database.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@Entity
@Getter
@Setter
public class BResult {
    @Id
    private String cname;
    private String grade;
    private BigDecimal exam;

    public BResult() {
    }

    public BResult(String cname, String grade, BigDecimal exam) {
        this.cname = cname;
        this.grade = grade;
        this.exam = exam;
    }
}