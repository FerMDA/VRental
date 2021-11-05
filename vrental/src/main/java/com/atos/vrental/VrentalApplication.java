package com.atos.vrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class VrentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(VrentalApplication.class, args);
    }

    
}
