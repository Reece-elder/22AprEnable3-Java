package com.qa.mockitoTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CoinFlipTest {
	
	// Create my CoinFlipManager
	CoinFlipManager coin = new CoinFlipManager();
	
	// Mock our random object
	// mocked our testRng
//	Random testRng = Mockito.mock(Random.class);
	CoinFlipManager mockCoin = Mockito.mock(CoinFlipManager.class);
	
	@Disabled
	@Test
	public void coinFlipHeads() {
		// Arrange
		String result;
		
		// Act
		result = coin.coinFlip();
		
		// Assert
		Assertions.assertEquals("HEADS", result);
	}
	
	@Test 
	public void coinFlipMock() {
		// Arrange
		String result;
		
		// When our coin object uses the nextInt(101) it will return 33
		Mockito.when(mockCoin.rng.nextInt(101)).thenReturn(33);
		
		// Act 
		result = mockCoin.coinFlip();
		System.out.println(mockCoin.rng.nextInt(101));
		
		// Assert 
		Assertions.assertEquals("HEADS", result);
	}

}
