package com.nursery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nursery")
public class PlantShopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantShopBackendApplication.class, args);
	}

}
