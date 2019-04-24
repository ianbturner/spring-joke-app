package com.turnersmithson.norris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class NorrisApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorrisApplication.class, args);
    }

}
