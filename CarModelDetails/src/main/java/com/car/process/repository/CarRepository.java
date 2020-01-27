package com.car.process.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.car.process.entities.CarModel;

@Repository
public interface CarRepository extends CrudRepository<CarModel, Long>{

}
