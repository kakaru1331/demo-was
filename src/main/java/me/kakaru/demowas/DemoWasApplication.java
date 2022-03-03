package me.kakaru.demowas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoWasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWasApplication.class, args);
	}

}
