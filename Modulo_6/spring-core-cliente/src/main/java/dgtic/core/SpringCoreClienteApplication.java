package dgtic.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCoreClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreClienteApplication.class, args);
	}

	@Bean
	public RestTemplate base() {
		return new RestTemplate();
	}

}
