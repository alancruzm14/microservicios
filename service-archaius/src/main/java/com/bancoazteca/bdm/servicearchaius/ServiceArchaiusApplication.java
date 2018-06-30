package com.bancoazteca.bdm.servicearchaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceArchaiusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceArchaiusApplication.class, args);
	}
}
