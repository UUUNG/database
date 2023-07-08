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
public class EResult {
    @Id
    private String sno;
    private String sname;
    private BigDecimal total_credits;
    private BigDecimal average_exam_score;

    public EResult() {
    }

    public EResult(String sno, String sname, BigDecimal total_credits, BigDecimal average_exam_score) {
        this.sno = sno;
        this.sname = sname;
        this.total_credits = total_credits;
        this.average_exam_score = average_exam_score;
    }
}