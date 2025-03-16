package com.example.ec3_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ec3FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec3FeignClientApplication.class, args);
	}

}
