package com.sssm.eurekaemployeeproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaEmployeeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEmployeeProducerApplication.class, args);
	}
}
