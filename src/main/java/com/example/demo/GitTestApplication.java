package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    private static Order order = new Order();

    public static void test() {

        String h = order.getName();
        if (h.equals(Constant.DATA_TYPE)) {
            System.out.println("Hai Hello");
        }
    }

    public static void main(String[] args) {

        test();
        System.out.println("Hello GIT test !!");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
