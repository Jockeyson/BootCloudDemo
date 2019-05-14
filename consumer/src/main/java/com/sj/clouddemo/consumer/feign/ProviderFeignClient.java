package com.sj.clouddemo.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-provider")
public interface ProviderFeignClient {
    //hello是服务提供方对应的方法路径
    @RequestMapping(value="/provider/hello",method = RequestMethod.GET)
    String hello();
}
