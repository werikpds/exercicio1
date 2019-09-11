package classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classes.model.Calculadora;

@Configuration
public class AppConfig {
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
}
