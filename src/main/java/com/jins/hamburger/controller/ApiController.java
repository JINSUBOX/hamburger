package com.jins.hamburger.controller;

import com.jins.hamburger.domain.hamburger.Hamburger;
import com.jins.hamburger.service.HamburgerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {
    private final HamburgerService hamburgerService;

    @GetMapping("/burgers")
    public ResponseEntity<List<Hamburger>> findAll() {
        List<Hamburger> items = hamburgerService.findAll();
        return ResponseEntity.ok().body(items);
    }

    @GetMapping("/burgers/{id}")
    public ResponseEntity<Hamburger> find(@PathVariable("id") Long id) {
        Optional<Hamburger> item = hamburgerService.find(id);
        return ResponseEntity.of(item);
    }
}
