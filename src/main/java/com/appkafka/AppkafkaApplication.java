package com.appkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AppkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppkafkaApplication.class, args);
	}

}
