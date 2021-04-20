package com.hack.followup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hack.followup.dao")
public class FollowUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FollowUpApplication.class, args);
    }

}
