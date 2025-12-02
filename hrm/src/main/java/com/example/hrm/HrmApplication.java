package com.example.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HrmApplication {
    @GetMapping("/selvamani")
    public String showselvamani(){
        return "hello chennai";
    }

	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}

}
