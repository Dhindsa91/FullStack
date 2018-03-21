package com.devopsbuddy;

import org.springframework.boot.SpringApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistence.repositories")
public class DevopsbuddyApplication {


	public static void main(String[] args) {
	SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}
