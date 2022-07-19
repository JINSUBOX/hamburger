package com.jins.hambuger.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
@Table(name = "hamburger")
public class Hamburger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String price;

    @Builder
    public Hamburger(String name, String price){
        this.name = name;
        this.price = price;
    }

}
