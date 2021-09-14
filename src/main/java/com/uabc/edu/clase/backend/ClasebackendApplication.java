package com.uabc.edu.clase.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.uabc.edu.clase.backend.repository")
public class ClasebackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasebackendApplication.class, args);
    }

}
