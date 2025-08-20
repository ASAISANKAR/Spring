package com.spring.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JoblistingApplication.class, args);
		System.out.println("Server Running....");
		Alien t1 = context.getBean(Alien.class);
		Alien t2 = new Alien();
		t1.test();
		System.out.println("From test 2");
		t2.test();
	}

}
