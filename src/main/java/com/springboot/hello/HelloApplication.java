package com.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt =  SpringApplication.run(HelloApplication.class, args);

		FirstController f = cxt.getBean(FirstController.class); // here we get the object of FirstClass Controller.
		f.show();
// if we comment this Object then also we get the object here . Because springboot follows singleton Design pattern 
	}

}
