package com.bekov.config_server_67;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer67Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer67Application.class, args);
    }

}
