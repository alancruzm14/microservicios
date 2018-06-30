package com.bancoazteca.bdm.serviceeureka;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEurekaServer
@EnableAutoConfiguration
public class ServiceEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceEurekaApplication.class).web(true).run(args);
	}
}
