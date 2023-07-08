package com.example.database.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "STUDENT")
@Builder
@Getter
@Setter
public class StudentEntity {
    @Id
    @Column(name = "SNO")
    private String sno;

    @Column(name = "PNO")
    private String pno;

    @Column(name="SNAME")
    private String sname;

    @Column(name="YEAR")
    private String year;

    @Column(name="DEPT")
    private String dept;


}
