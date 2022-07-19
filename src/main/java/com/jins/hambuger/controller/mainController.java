package com.jins.hambuger.controller;

import com.jins.hambuger.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/main")
    public Map<String, Object> mainController(){
        return mainService.getMainData();
    }
}
