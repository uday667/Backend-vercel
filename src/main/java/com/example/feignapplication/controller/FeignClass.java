package com.example.feignapplication.controller;

import com.example.feignapplication.feign.FeignClientClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.Locator;

import javax.xml.stream.Location;

@RestController
@RequestMapping("/location")
public class FeignClass {

    @Autowired
    FeignClientClass feignClientClass;

    @GetMapping("/get")
    public String callingDone() {
        System.out.println(feignClientClass.callingMethod());
        return "called";
    }
    @GetMapping("/add")
    public  String test() {
        return "get the things done";
    }

    @GetMapping("/getLocation")
    public String getLocationByCurrentStatus() {
        String s = Location.class.descriptorString();
        return s;
    }
}
