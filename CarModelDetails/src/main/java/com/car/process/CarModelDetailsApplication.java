package com.car.process;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.car.process.entities.CarModel;
import com.car.process.repository.CarRepository;

@SpringBootApplication
public class CarModelDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarModelDetailsApplication.class, args);
	}

	@Bean
	CommandLineRunner init(final CarRepository carRepository) {
		return arg -> {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String dateString = "14/07/2018";
			CarModel carModel = new CarModel();
			carModel.setvinNumber("BZ23049");
			carModel.setBrand("AUDI");
			carModel.setModel("A200");
			carModel.setVeichleType("Sport");
			carModel.setPlateCountry("UK");
			carModel.setPlateNumber("AB930ZR");
			carModel.setCreationDate(new Date(Date.parse(dateString)));
			carModel.setManifacturedCountry("Germany");
			carRepository.save(carModel);
		};
	}

}
