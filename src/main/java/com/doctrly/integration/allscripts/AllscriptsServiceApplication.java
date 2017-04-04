package com.doctrly.integration.allscripts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class AllscriptsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllscriptsServiceApplication.class, args);
	}

}
