package com.sj.clouddemo.consumer.controller;

import com.sj.clouddemo.consumer.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("hello")
    public String hello()
    {
        // 服务提供者url、返回数据类型
        //String s = restTemplate.getForObject("http://eureka-provider/hello", String.class);
        String s=providerFeignClient.hello();
        return "consumer from ："+s;

    }
}
