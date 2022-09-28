package com.example.obexercise123;

import com.example.obexercise123.entities.Laptop;
import com.example.obexercise123.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObExercise123Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ObExercise123Application.class, args);
		LaptopRepository laptopRepository = applicationContext.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"HP",8,512,1500.0,true);
		Laptop laptop2 = new Laptop(null,"APPLE",8,256,2000.0,true);

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
	}

}
