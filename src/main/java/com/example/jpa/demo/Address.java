package com.example.jpa.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Embeddable
@Getter
@Setter
public class Address {

    @GeneratedValue
    private Long id;

    private String addr1;

    private String addr2;
}
