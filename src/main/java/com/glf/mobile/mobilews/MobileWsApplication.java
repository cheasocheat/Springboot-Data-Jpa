package com.glf.mobile.mobilews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
public class MobileWsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MobileWsApplication.class, args);
	}
}
