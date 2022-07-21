package com.jins.hamburger.domain.hamburger;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Hamburger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String price;

    @Builder
    public Hamburger(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void update(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
