package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WRITTEN_BY")
@Builder
@Getter
@Setter
public class WrittenByEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name="ISBN")
    private String isbn;
}
