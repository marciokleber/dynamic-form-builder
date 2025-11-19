package com.github.marciokleber.dynamicformbuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DynamicFormBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicFormBuilderApplication.class, args);
    }

}
