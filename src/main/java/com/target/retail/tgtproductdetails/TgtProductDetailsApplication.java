package com.target.retail.tgtproductdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TgtProductDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgtProductDetailsApplication.class, args);
	}

}
