package com.client02.controller;

import com.client02.api.Test01Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient02Controller {

    @Autowired
    private Test01Api test01Api;

    @RequestMapping("test02")
    public String testClient02(){

        String test01 = test01Api.test01();

        System.out.println("======testClient02======");

        return test01;
    }
}
