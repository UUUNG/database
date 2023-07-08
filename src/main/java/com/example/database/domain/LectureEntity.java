package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "LECTURE")
@Builder
@Getter
@Setter
public class LectureEntity {
    @Id
    @Column(name = "CNO")
    private String cno;

    @Column(name = "PNO")
    private String pno;

    @Column(name="LEC_TIME")
    private String lec_time;

    @Column(name="ROOM")
    private String room;

}
