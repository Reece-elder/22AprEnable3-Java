package com.qa.jdbcPetShopTest;
// Mockito setup stuff

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.qa.jdbcPetShop.Bird;
import com.qa.jdbcPetShop.PetShop;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
public class PetShopTest {
	
	// Make my Mocks
	@Mock
	private Bird mockBird; // mockBird.makeNoise()
	
//	@Mock
//	private PetShop mockShop; // mockShop.getBirdById()
	
	@InjectMocks
	private PetShop petShop; // The object we are running
	
	// Bird objects we can use
	Bird bird1Id = new Bird(1, "test colour", 10, "test name");
	Bird bird1 = new Bird("test colour", 10, "test name");
	
	@Test
	public void birdNoiseByIdTest() {
		
		// Arrange 
		// Mocking our Bird method
		// makeNoise will return "test String"
		Mockito.when(mockBird.makeNoise()).thenReturn("test string");
		
		// Mocking our getBirdById
		// getBirdById will return bird1Id
//		Mockito.when(mockShop.getBirdById(1)).thenReturn(bird1Id);

		
		String result;
		
		// Act 
		result = petShop.birdNoiseById(1);
		System.out.println(result);
		
	}

}
