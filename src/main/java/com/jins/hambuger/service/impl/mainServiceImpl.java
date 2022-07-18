package com.jins.hambuger.service.impl;

import com.jins.hambuger.service.mainService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class mainServiceImpl implements mainService {

    @Override
    public Map<String, Object> getMainData() {

        Map<String, Object> mainData = new HashMap<>();

        mainData.put("mcdonalds","big mac");
        mainData.put("kfc","zinger burger");
        mainData.put("burgerking","whopper");

        return mainData;
    }
}
