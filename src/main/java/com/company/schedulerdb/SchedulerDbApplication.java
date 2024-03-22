package com.company.schedulerdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerDbApplication.class, args);
    }

}
