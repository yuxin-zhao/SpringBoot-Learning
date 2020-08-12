package com.dashuai.learning.mybatis.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordApi {

    @GetMapping("/")
    public String helloWord() {
        return "Hello word";
    }
}
