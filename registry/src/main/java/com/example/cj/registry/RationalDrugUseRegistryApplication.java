package com.example.cj.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RationalDrugUseRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RationalDrugUseRegistryApplication.class, args);
	}
}
