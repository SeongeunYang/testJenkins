package com.test.testjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "빌드 캐시 사라져라 얍!";
    }
}
