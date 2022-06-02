package es.ivan.modelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ModelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelosApplication.class, args);
	}

}
