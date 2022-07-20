package com.jins.hamburger.domain.hamburger;

import lombok.*;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hamburger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String price;

    @Builder
    public Hamburger (String name, String price){
        this.name = name;
        this.price = price;
    }

    public Hamburger updateWith(Hamburger hamburger) {
        return new Hamburger(
                this.id,
                hamburger.name,
                hamburger.price
        );
    }
}
