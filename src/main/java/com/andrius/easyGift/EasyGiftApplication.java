package com.andrius.easyGift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class EasyGiftApplication {

    @PostConstruct
    public void hello (){
        System.out.println("Post construct works!");
    }

    public static void main(String[] args) {
        SpringApplication.run(EasyGiftApplication.class, args);
    }
}
