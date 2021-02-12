package com.atrc.dockit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockitApplication.class, args);
		System.out.println("Whole Lot Of yummy Jars Loaded wih Tomcat! ");
	}

}
