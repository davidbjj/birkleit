package com.car.process.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Entity
public class CarModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vinNumber;
	private String brand;
	private String model;
	private String veichleType;
	private String plateCountry;
	private String plateNumber;
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date creationDate;
	private String manifacturedCountry;

	public CarModel() {
	}

	public CarModel(Long id, String vinNumber, String brand, String model, String veichleType, String plateCountry,
			String plateNumber, Date creationDate, String manifacturedCountry) {
		this.id = id;
		this.vinNumber = vinNumber;
		this.brand = brand;
		this.model = model;
		this.veichleType = veichleType;
		this.plateCountry = plateCountry;
		this.plateNumber = plateNumber;
		this.creationDate = creationDate;
		this.manifacturedCountry = manifacturedCountry;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getvinNumber() {
		return vinNumber;
	}

	public void setvinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVeichleType() {
		return veichleType;
	}

	public void setVeichleType(String veichleType) {
		this.veichleType = veichleType;
	}

	public String getPlateCountry() {
		return plateCountry;
	}

	public void setPlateCountry(String plateCountry) {
		this.plateCountry = plateCountry;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getManifacturedCountry() {
		return manifacturedCountry;
	}

	public void setManifacturedCountry(String manifacturedCountry) {
		this.manifacturedCountry = manifacturedCountry;
	}

	@Override
	public String toString() {
		return "CarModel [id=" + id + ", vinNumber=" + vinNumber + ", brand=" + brand + ", model=" + model
				+ ", veichleType=" + veichleType + ", plateCountry=" + plateCountry + ", plateNumber=" + plateNumber
				+ ", creationDate=" + creationDate + ", manifacturedCountry=" + manifacturedCountry + "]";
	}

}
