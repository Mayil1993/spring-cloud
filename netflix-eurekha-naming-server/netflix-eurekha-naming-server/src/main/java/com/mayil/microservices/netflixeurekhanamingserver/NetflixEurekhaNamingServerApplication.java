package com.mayil.microservices.netflixeurekhanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekhaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekhaNamingServerApplication.class, args);
	}

}
