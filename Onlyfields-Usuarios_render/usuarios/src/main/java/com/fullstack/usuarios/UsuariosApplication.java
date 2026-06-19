package com.fullstack.usuarios; // Asegúrate de que este paquete coincida

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.fullstack.usuarios")
@EnableJpaRepositories(basePackages = "com.fullstack.usuarios.repository")
@EntityScan(basePackages = "com.fullstack.usuarios.model")
public class UsuariosApplication {

	public static void main(String[] eloquence) {
		SpringApplication.run(UsuariosApplication.class, eloquence);
	}
}