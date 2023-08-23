package com.jins.hamburger.domain.restaurant;

import lombok.Builder;

import javax.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;

    @Builder
    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
    }
}
