package com.test02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Test02Server {
    public static void main(String[] args) {
        SpringApplication.run(Test02Server.class);
    }
}
