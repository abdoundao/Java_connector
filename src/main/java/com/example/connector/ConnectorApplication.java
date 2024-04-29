package com.example.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.builder.SpringApplicationBuilder;


@ComponentScan(basePackages = {"controller"})
@ComponentScan(basePackages = {"config"})


@SpringBootApplication
public class ConnectorApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConnectorApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(ConnectorApplication.class, args);
	}
}