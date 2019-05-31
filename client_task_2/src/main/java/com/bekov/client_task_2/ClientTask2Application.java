package com.bekov.client_task_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope

public class ClientTask2Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientTask2Application.class, args);
    }

}
