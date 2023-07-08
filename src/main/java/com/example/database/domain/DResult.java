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
public class DResult {
    @Id
    private String cname;
    private BigDecimal max_score;
    private BigDecimal min_score;
    private String sno;
    private String sname;

    public DResult() {
    }

    public DResult(String cname, BigDecimal max_score, BigDecimal min_score, String sno, String sname) {
        this.cname = cname;
        this.max_score = max_score;
        this.min_score = min_score;
        this.sno = sno;
        this.sname = sname;

    }
}