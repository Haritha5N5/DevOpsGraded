package com.greatlearning.week10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOps  implements CommandLineRunner{
@Autowired

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SpringApplication.run(DevOps.class, args);
		System.out.println("Spring boot is running");
		System.out.println("Hello Dev-Ops");
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("RUN method running");
	
	}

	
	

}
