package com.weiguang.root.rpc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.weiguang.root.rpc.impl")
@SpringBootApplication
public class RootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootServiceApplication.class);
    }
}
