package com.jins.hamburger.controller;

import com.jins.hamburger.dto.hamburger.HamburgerListResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerResponseDto;
import com.jins.hamburger.dto.hamburger.HamburgerSaveRequestDto;
import com.jins.hamburger.dto.hamburger.HamburgerUpdateRequestDto;
import com.jins.hamburger.service.HamburgerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Burgers", description = "햄버거 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/burgers")
public class BurgersController {
    private final HamburgerService hamburgerService;

    //햄버거 등록 contrller
    @PostMapping
    public Long save(@RequestBody HamburgerSaveRequestDto requestDto) {
        return hamburgerService.save(requestDto);
    }

    //전체 조회 controller
    @GetMapping
    public List<HamburgerListResponseDto> findAll() {
        return hamburgerService.findAllDesc();
    }

    //단일 조회 contoller
    @GetMapping("/{id}")
    public HamburgerResponseDto findById(@PathVariable Long id) {
        return hamburgerService.findById(id);
    }

    //수정 controller
    @PutMapping("/{id}")
    public Long update(
            @PathVariable Long id,
            @RequestBody HamburgerUpdateRequestDto requestDto) {
        return hamburgerService.update(id, requestDto);
    }

    //삭제 controller
    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        hamburgerService.delete(id);
        return id;
    }

}
