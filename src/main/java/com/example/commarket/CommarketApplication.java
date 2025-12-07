package com.example.commarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CommarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommarketApplication.class, args);
	}

}
