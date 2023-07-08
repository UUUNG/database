package com.example.database.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "ENROLL")
@Builder
@Getter
@Setter
public class EnrollEntity {
    @Id
    @Column(name = "SNO")
    private String sno;

    @Column(name = "CNO")
    private String cno;

    @Column(name="GRADE")
    private String grade;

    @Column(name="EXAM")
    private String exam;

}
