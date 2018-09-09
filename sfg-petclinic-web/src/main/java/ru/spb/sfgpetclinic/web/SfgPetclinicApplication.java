package ru.spb.sfgpetclinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"ru.spb"})
public class SfgPetclinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetclinicApplication.class, args);
    }
}
