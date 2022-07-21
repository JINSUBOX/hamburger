package com.jins.hamburger.dto.hamburger;

import com.jins.hamburger.domain.hamburger.Hamburger;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HamburgerSaveRequestDto {
    private String name;
    private String price;

    @Builder
    public HamburgerSaveRequestDto(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Hamburger toEntity(){
        return Hamburger.builder().name(name).price(price).build();
    }
}
