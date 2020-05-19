package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

	public static void test(){
		System.out.println("Inside Test method");
	}

	public static void main(String[] args) {

		test();
		System.out.println("Hello GIT test !!");
		SpringApplication.run(GitTestApplication.class, args);
	}

}
