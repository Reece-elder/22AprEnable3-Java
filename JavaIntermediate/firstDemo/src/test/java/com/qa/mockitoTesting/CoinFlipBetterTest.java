package com.qa.mockitoTesting;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// When using Mockito we can tell our class that we are using Mockito
// When using JUnit 5 we need to use this instead 
@ExtendWith(MockitoExtension.class)
public class CoinFlipBetterTest {
	
	// Mockito gives us annotations we can use to 'inject' mocks 
	// When running our coin class, we want to use the mocked random object 
	
	// This Random object is used by our CoinFlipManager
	@Mock
	private Random mockRng;
	
	// Make a new coinFlip object, and pass in the mocked Random
	@InjectMocks
	private CoinFlipManager coinFlip;
	
	@Test
	public void coinFlipHeads() {
		
		// Arrange 
		// When we access the nextInt(101) in our mocked object it WILL return 30 
		// If we access mockRng.nextInt(102) it won't return 30, because we haven't mocked that
		Mockito.when(mockRng.nextInt(101)).thenReturn(30);
		
		String result;
		
		// Act 
		result = coinFlip.coinFlip();
		System.out.println(result); // always returns HEADS
		System.out.println(coinFlip.rng.nextInt(101)); // always returns 30
		
		// Assert
		Assertions.assertTrue(result.equals("HEADS"));	
	}
	
	@Test
	public void coinFlipTails() {
		
		// Arrange 
		// When (in this specific test) nextInt(101) is called it will return 70
		Mockito.when(mockRng.nextInt(101)).thenReturn(70);
		
		String result;
		
		// Act
		// coinFlip() calls nextInt(101) -> which WILL return 70
		result = coinFlip.coinFlip();
		
		// Assert
		Assertions.assertEquals(result, "TAILS");
	}
	
	@Test
	public void coinFlipEdge() {
		Mockito.when(mockRng.nextInt(101)).thenReturn(100);
		
		String result;
		
		result = coinFlip.coinFlip();
		
		Assertions.assertEquals(result, "EDGE");
	}

}
