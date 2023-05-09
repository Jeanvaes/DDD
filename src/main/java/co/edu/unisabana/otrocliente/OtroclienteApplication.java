package co.edu.unisabana.otrocliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OtroclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtroclienteApplication.class, args);
	}

}
