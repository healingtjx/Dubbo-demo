package com.dubbo.consumer;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDubbo
@SpringBootApplication
public class Main {

    @GetMapping("/test")
    public String test(){
        return "haha";
    }

    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
