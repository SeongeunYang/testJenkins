package com.test.testjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello, Jenkins!! 자동 배포 테스트!";
    }
}
