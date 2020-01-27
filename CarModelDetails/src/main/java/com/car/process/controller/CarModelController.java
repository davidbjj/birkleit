package com.car.process.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.car.process.entities.CarModel;
import com.car.process.repository.CarRepository;

import lombok.extern.java.Log;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Log
public class CarModelController {

	private final CarRepository carRespository;

	public CarModelController(CarRepository carRepository) {
		this.carRespository = carRepository;
	}

	@GetMapping("/cars")
	public List<CarModel> getCars() {		
		log.info("\n showing all cars into the Data Base");
		return (List<CarModel>) carRespository.findAll();
	}

	@PostMapping("/cars")
	void addCar(@RequestBody CarModel carModel) {
		carRespository.save(carModel);
		log.info("car with id" + carModel.getId() + " had been save");
	}

	@RequestMapping(value = "cars/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") long id) {
		CarModel carModel = new CarModel();
		carModel.setId(id);
		carRespository.delete(carModel);
		log.info("car with id " + id + " had been delete");
	}

	@GetMapping(value = "/carsxml", produces = MediaType.APPLICATION_XML_VALUE)
	public Optional<CarModel> findCars(@PathVariable("id") long id) {
		return carRespository.findById(id);
	}

}
