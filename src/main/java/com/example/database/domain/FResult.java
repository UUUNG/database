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
public class FResult {
    @Id
    private String cname;
    private String average_exam_score;
    private BigDecimal grade_a;
    private BigDecimal grade_b;
    private BigDecimal grade_c;
    private BigDecimal grade_d;
    private BigDecimal grade_f;
    public FResult() {
    }

    public FResult(String cname, String average_exam_score, BigDecimal grade_a, BigDecimal grade_b, BigDecimal grade_c,  BigDecimal grade_d,  BigDecimal grade_f){
        this.cname = cname;
        this.average_exam_score = average_exam_score;
        this.grade_a = grade_a;
        this.grade_b = grade_b;
        this.grade_c = grade_c;
        this.grade_d = grade_d;
        this.grade_f = grade_f;
    }
}