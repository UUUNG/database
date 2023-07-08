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
public class CResult {
    @Id
    private String sname;
    private String sno;
    private String cno;

    public CResult() {
    }

    public CResult(String sname, String sno, String cno) {
        this.sno = sno;
        this.sname = sname;
        this.cno = cno;
    }
}