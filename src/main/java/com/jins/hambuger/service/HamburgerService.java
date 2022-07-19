package com.jins.hambuger.service;

import com.jins.hambuger.domain.Hamburger;
import com.jins.hambuger.repository.HamburgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HamburgerService {

    private final HamburgerRepository hamburgerRepository;
    //
    public Hamburger findById(Long id) {
        return null;
    }
}
