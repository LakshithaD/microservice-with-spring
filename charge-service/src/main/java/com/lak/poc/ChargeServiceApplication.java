package com.lak.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ChargeServiceApplication {
	
	public static void main(String[] args) throws Exception {

		SpringApplication.run(ChargeServiceApplication.class, args);
	}
}
