package com.dubbo.provider;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.consumer.dubbo.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDubbo
@SpringBootApplication
public class Main {

    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }

    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
