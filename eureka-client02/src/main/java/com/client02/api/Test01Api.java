package com.client02.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "EUREKA-CLIENT01",url = "http://localhost:8083")
public interface Test01Api {

    @RequestMapping("test02")
    public String test01();

}
