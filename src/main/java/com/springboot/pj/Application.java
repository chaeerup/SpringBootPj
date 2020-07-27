package com.springboot.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 내장 WAS를 실행
        SpringApplication.run(Application.class, args);
    }
}
