package com.jins.hamburger.dto.hamburger;

import com.jins.hamburger.domain.hamburger.Hamburger;
import lombok.Getter;

@Getter
public class HamburgerListResponseDto {
    private Long id;
    private String name;
    private String price;

    public HamburgerListResponseDto(Hamburger entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }
}
