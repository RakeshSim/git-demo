package com.rakesh.capital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchTradingApplication.class, args);
	}

}