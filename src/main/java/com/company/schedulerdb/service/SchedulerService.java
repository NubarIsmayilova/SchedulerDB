package com.company.schedulerdb.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SchedulerService {



    @Scheduled(fixedRate = 5000) // Run every 5 seconds
    public void printMessage() {
        System.out.println("Scheduled task executed at: " + new Date());
    }


    @Scheduled(cron = "0 0 14 * * ?") // Run at 2 PM every day
    public void runDailyTask() {
        System.out.println("Daily task executed at: " + LocalDateTime.now());
    }

    }

