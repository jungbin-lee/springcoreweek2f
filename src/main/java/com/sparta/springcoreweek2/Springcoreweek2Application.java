package com.sparta.springcoreweek2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springcoreweek2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcoreweek2Application.class, args);
    }

}
