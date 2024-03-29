package example.adam.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class AppConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(AppConfiguration.class, args);
	}

}
