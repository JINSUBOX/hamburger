package com.jins.hambuger.controller;

import com.jins.hambuger.domain.Hamburger;
import com.jins.hambuger.service.HamburgerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/burgers")
public class HamburgerController {

    private final HamburgerService hamburgerService;

    @GetMapping("{id}")
    public Hamburger getHamburger(Long id) {
        return null;
    }
}
