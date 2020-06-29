package com.weiguang.middle;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.weiguang.middle.impl")
@SpringBootApplication
public class MiddleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddleServiceApplication.class);
    }

}
