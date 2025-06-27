package com.translife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TranslifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranslifeApplication.class, args);
	}

}
