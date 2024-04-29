package com.example.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import java.util.Collections;


@ComponentScan(basePackages = {"controller"})
@ComponentScan(basePackages = {"config"})
@SpringBootApplication
public class ConnectorApplication {

    public static void main(String[] args) {
        // Lire le port à partir des arguments de la ligne de commande ou utiliser 8080 par défaut
        String port = System.getProperty("port", "8080");
        // Passer le port à l'application Spring Boot
        SpringApplication app = new SpringApplication(ConnectorApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", port));
        app.run(args);
    }
}
