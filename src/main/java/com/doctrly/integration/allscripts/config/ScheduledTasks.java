package com.doctrly.integration.allscripts.config;

import java.time.Instant;

import com.doctrly.integration.allscripts.service.UnityBatchService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;


@Slf4j
@Component
public class ScheduledTasks {

    private UnityBatchService unityBatchService;


    @Scheduled(initialDelay = (10000 * 1000), fixedRate = (60000 * 1000))
    public void reportCurrentTime() {

        try {
            log.info("The time is : {}", Instant.now().toString());
            unityBatchService.execute();
            log.info("The time is : {}", Instant.now().toString());
        }
        catch (Exception e) {
            log.error("Error: {}", e.getMessage());
            e.printStackTrace();
        }

    }


    @Autowired
    public void setUnityBatchService(UnityBatchService unityBatchService) {
        this.unityBatchService = unityBatchService;
    }

}