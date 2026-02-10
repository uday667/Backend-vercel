package com.example.feignapplication.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "local-class" , url = "http://localhost:8080")

public interface FeignClientClass {
    @GetMapping("post")
    public String callingMethod();
}
