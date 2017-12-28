package com.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.boot.*"})
public class CyouBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(CyouBoot01Application.class, args);
	}
}
