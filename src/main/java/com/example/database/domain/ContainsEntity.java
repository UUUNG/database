package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "CONTAINS")
@Builder
@Getter
@Setter
public class ContainsEntity {
    @Id
    @Column(name = "BASKETID")
    private String basketid;

    @Column(name="ISBN")
    private String isbn;

    @Column(name="NUM")
    private String num;

}
