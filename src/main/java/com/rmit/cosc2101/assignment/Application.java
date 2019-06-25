package com.rmit.cosc2101.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.autoconfigure.storage.GcpStorageAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={GcpStorageAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
