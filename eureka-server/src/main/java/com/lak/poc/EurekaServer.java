package com.lak.poc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer extends SpringBootServletInitializer {


	public static void main(String[] args) throws Exception {

		configureApplication(new SpringApplicationBuilder()).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return configureApplication(builder);
	}
	
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {

		return builder.sources(EurekaServer.class);
	}
}
