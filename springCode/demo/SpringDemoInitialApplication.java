package io.javasagedemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoInitialApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoInitialApplication.class, args);
//		Home h = new Home(); //tight coupling 
		Home h = context.getBean(Home.class);
		h.connect();
	}

}
