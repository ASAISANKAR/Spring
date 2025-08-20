package com.spring.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JoblistingApplication.class, args);
		System.out.println("Server Running....");
		Alien t1 = context.getBean(Alien.class);
		t1.test();
	}

}
