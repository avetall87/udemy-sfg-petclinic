package ru.spb.sfgpetclinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"ru.spb"})
public class SfgPetclinicApplication {

    public static void main(String[] args) throws InterruptedException {

//        final BlockingQueue<String> q = new ArrayBlockingQueue<String>(1);
//        String peek = q.peek();
////        q.take();
//
//        final Semaphore semaphore = new Semaphore(1);
//        semaphore.acquire();
        SpringApplication.run(SfgPetclinicApplication.class, args);
    }
}