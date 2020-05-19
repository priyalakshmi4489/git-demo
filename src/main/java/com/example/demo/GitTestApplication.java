package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void test() {
        
        String h = "hello";
        if (h.equals(Constant.DATA_TYPE)) {
            System.out.println("Hai Hello");
        }
    }

    public static void addedMethod() {
        
        System.out.println("Added this new method to test git pull");
    }

    public static void main(String[] args) {

        test();
        System.out.println("Hello GIT test !!");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
