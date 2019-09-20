package com.dubbo.consumer.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.consumer.dubbo.TestService;

@Service(version = "1.0.0",timeout = 6000)
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "调用了Consumuer";
    }
}
