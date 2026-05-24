package com.mhmtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MhmtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhmtDemoApplication.class, args);
	}
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World Spring World";
    }

}
