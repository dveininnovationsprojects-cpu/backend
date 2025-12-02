package com.example.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HrmApplication {
    @GetMapping("/selvamani")
    public String showselvamani(){
        return "hello chennai";
    }
    @GetMapping("/Navin")
    public String shownavin() {
        return "Vanakam da mapla navin rmd";

    }
        @GetMapping("/kishore")
        public String showKishore () {
            return "hello team mates ";
        }
        public static void main (String[]args){
            SpringApplication.run(HrmApplication.class, args);
        }

    }
