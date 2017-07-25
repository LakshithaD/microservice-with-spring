package com.lak.poc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {

		configureApplication(new SpringApplicationBuilder()).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return configureApplication(builder);
	}
	
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {

		return builder.sources(EurekaClientApplication.class);
	}
}	
