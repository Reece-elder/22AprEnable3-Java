package com.qa.petShopTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.jdbcPetShopTwo.Bird;
import com.qa.jdbcPetShopTwo.Controller;
import com.qa.jdbcPetShopTwo.PetShop;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {
	
	@Mock
	private PetShop mockshop;
	
	@InjectMocks
	private Controller controller;
	
	Bird bird1 = new Bird("test colour", 10, "test name");
	Bird bird1Id = new Bird(1, "test colour", 10, "test name");
	
	@Test
	public void createTest() {
		// Arrange
		Mockito.when(mockshop.addBird(bird1)).thenReturn(bird1Id);
		Bird result;
		
		// Act
		result = controller.create(bird1);
		System.out.println(result);
		
		// Assert
		Assertions.assertEquals(bird1Id, result);
		
		Mockito.verify(mockshop, Mockito.times(1)).addBird(bird1);
	}

}
