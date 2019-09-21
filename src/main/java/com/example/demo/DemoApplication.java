package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("----  切换分支     ---->king ---->master");
		System.out.println("2019年9月22日01:19:41");
		SpringApplication.run(DemoApplication.class, args);
	}

}
