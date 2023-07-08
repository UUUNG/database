package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PUBLISHED_BY")
@Builder
@Getter
@Setter
public class PublishedByEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name="ISBN")
    private String isbn;
}
