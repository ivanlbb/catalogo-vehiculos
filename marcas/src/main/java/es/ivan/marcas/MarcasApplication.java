package es.ivan.marcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MarcasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarcasApplication.class, args);
	}

}
