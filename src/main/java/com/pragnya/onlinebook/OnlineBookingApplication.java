package com.pragnya.onlinebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pragnya.onlinebook"})
public class OnlineBookingApplication {

    public static void main(String[] args) {

        SpringApplication.run(OnlineBookingApplication.class, args);

    }
}
