package com.jins.hamburger.service;

import com.jins.hamburger.domain.hamburger.Hamburger;
import com.jins.hamburger.domain.hamburger.HamburgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class HamburgerService {
    private final HamburgerRepository hamburgerRepository;

    //모든 햄버거 조회
    @Transactional(readOnly = true)
    public List<Hamburger> findAll() {
        List<Hamburger> list = new ArrayList<>();
        Iterable<Hamburger> hamburgers = hamburgerRepository.findAll();
        hamburgers.forEach(list::add);
        return list;
    }
    //햄버거 조회
    public Optional<Hamburger> find(Long id) {
        return hamburgerRepository.findById(id);
    }
    //햄버거 입력
    public Hamburger create(Hamburger newHamburger) {
        Hamburger copy = new Hamburger(
                newHamburger.getName(),
                newHamburger.getPrice()
        );
        return hamburgerRepository.save(copy);
    }
    //햄버거 수정
    public Optional<Hamburger> update( Long id, Hamburger newHamburger) {
        return hamburgerRepository.findById(id)
                .map(oldHamburger -> {
                    Hamburger updated = oldHamburger.updateWith(newHamburger);
                    return hamburgerRepository.save(updated);
                });
    }
    //햄버거 삭제
    public void delete(Long id) {
        hamburgerRepository.deleteById(id);
    }
}