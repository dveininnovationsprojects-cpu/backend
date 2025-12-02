package com.example.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class HrmApplication {

    @GetMapping("/Navin")
    public String shownavin() {
        return "Vanakam da mapla navin rmd";

    }

        public static void main (String[]args){
            SpringApplication.run(HrmApplication.class, args);
        }

    }
