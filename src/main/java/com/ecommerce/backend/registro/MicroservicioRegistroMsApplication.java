package com.ecommerce.backend.registro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicioRegistroMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioRegistroMsApplication.class, args);
	}

}
