package com.devopsbuddy;

import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.devopsbuddy.backend.service","com.devopsbuddy.config", "com.devopsbuddy.web"   })
@RequestMapping("/")
public class DevopsbuddyApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}
