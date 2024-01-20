package weichselbaum.fr24proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Fr24proxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fr24proxyApplication.class, args);
	}

}
