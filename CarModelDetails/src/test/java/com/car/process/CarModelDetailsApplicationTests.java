package com.car.process;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.assertj.core.api.Assertions.assertThat;
import com.car.process.controller.CarModelController;
import com.car.process.entities.CarModel;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(CarModelController.class)
public class CarModelDetailsApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private CarModelController carModelController;

	@Test
	public void whenSpringContextIsBootstrapped_thenNoExceptions() {
	}

	@Test
	public void getAllCars() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		 
		 		
		CarModel carModel = new CarModel();
		carModel.setvinNumber("000000");
		carModel.setBrand("Chevrolet");
		carModel.setModel("Onix");
		carModel.setPlateCountry("IT");
		carModel.setPlateNumber("56666");
		carModel.setVeichleType("hatchback");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateString = "14/07/2018";
		carModel.setCreationDate(new Date(Date.parse(dateString)));
		carModel.setManifacturedCountry("Italy");

		List<CarModel> allCars = carModelController.getCars();
		ResponseEntity<Object> responseEntity = (ResponseEntity<Object>) carModelController.getCars();
		 
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
	}

}
