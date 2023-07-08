package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "COURSE")
@Builder
@Getter
@Setter
public class CourseEntity {
    @Id
    @Column(name = "CNO")
    private String cno;

    @Column(name = "CNAME")
    private String cname;

    @Column(name="CREDIT")
    private String credit;

    @Column(name="SESSIONS")
    private String sessions;

}
