package com.jins.hamburger.service;

import com.jins.hamburger.dto.hamburger.HamburgerListResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerSaveRequestDto;
import com.jins.hamburger.dto.hamburger.HamburgerUpdateRequestDto;
import com.jins.hamburger.domain.hamburger.Hamburger;
import com.jins.hamburger.domain.hamburger.HamburgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class HamburgerService {
    private final HamburgerRepository hamburgerRepository;

    //햄버거 입력
    public Long save(HamburgerSaveRequestDto requestDto) {
        return hamburgerRepository.save(requestDto.toEntity()).getId();
    }

    //햄버거 조회
    public HamburgerResponseDto findById(Long id) {
        Hamburger entity = hamburgerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("없는 버거 입니다. id = " + id));
        return new HamburgerResponseDto(entity);
    }

    //모든 햄버거 조회
    public List<HamburgerListResponseDto> findAllDesc() {
        return hamburgerRepository.findAllDesc().stream().map(HamburgerListResponseDto::new).collect(Collectors.toList());
    }

    //햄버거 수정
    @Transactional
    public Long update(Long id, HamburgerUpdateRequestDto requestDto) {
        Hamburger hamburger = hamburgerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(" 없는 버거 입니다. id = " + id));
        hamburger.update(requestDto.getName(), requestDto.getPrice());
        return id;
    }

    //햄버거 삭제
    public void delete(Long id) {
        Hamburger hamburger = hamburgerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("없는 버거 입니다. id = " + id));
        hamburgerRepository.delete(hamburger);
    }
}