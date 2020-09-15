package com.apps.task_show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskShowApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskShowApplication.class, args);
    }

}
