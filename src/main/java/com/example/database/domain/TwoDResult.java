package com.example.database.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Entity
@Getter
@Setter
public class TwoDResult {
    @Id
    private String customer_name;
    private String title;
    private String publisher_name;
    private String author_name;
    private String address;
    private String url;

    public TwoDResult() {
    }

    public TwoDResult(String customer_name, String title, String publisher_name, String author_name, String address, String url) {
        this.customer_name = customer_name;
        this.title = title;
        this.publisher_name = publisher_name;
        this.author_name = author_name;
        this.address = address;
        this.url = url;
    }
}