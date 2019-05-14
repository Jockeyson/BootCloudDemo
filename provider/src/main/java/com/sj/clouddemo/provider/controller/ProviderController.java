package com.sj.clouddemo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String hello()
    {
        return "I am a provider";
    }
}
