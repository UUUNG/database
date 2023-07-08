package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PROFESSOR")
@Builder
@Getter
@Setter
public class ProfessorEntity {
    @Id
    @Column(name = "PNO")
    private String pno;

    @Column(name = "PNAME")
    private String pname;

    @Column(name="PMAJOR")
    private String pmajor;

    @Column(name="PDEPT")
    private String pdept;

}
