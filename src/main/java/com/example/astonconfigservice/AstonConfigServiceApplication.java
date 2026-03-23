package com.example.astonconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AstonConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AstonConfigServiceApplication.class, args);
    }

}
