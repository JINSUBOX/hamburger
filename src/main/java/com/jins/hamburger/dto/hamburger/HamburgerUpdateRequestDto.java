package com.jins.hamburger.dto.hamburger;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HamburgerUpdateRequestDto {
    private String name;
    private String price;

    @Builder
    public HamburgerUpdateRequestDto(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
