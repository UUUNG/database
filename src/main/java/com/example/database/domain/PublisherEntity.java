package com.example.database.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PUBLISHER")
@Builder
@Getter
@Setter
public class PublisherEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name="PHONE")
    private String phone;

    @Column(name="URL")
    private String url;
}
