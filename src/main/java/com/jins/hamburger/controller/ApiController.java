package com.jins.hamburger.controller;

import com.jins.hamburger.dto.hamburger.HamburgerListResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerSaveRequestDto;
import com.jins.hamburger.dto.hamburger.HamburgerUpdateRequestDto;
import com.jins.hamburger.service.HamburgerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {
    private final HamburgerService hamburgerService;

    //햄버거 등록 contrller
    @PostMapping("/burgers")
    public Long save(@RequestBody HamburgerSaveRequestDto requestDto) {
        return hamburgerService.save(requestDto);
    }

    //전체 조회 controller
    @GetMapping("/burgers")
    public List<HamburgerListResponseDto> findAll() {
        return hamburgerService.findAllDesc();
    }

    //단일 조회 contoller
    @GetMapping("/burgers/{id}")
    public HamburgerResponseDto findById(@PathVariable Long id) {
        return hamburgerService.findById(id);
    }

    //수정 controller
    @PutMapping("/burgers/{id}")
    public Long update(
            @PathVariable Long id,
            @RequestBody HamburgerUpdateRequestDto requestDto) {
        return hamburgerService.update(id, requestDto);
    }

    //삭제 controller
    @DeleteMapping("/burgers/{id}")
    public Long delete(@PathVariable Long id) {
        hamburgerService.delete(id);
        return id;
    }

}
