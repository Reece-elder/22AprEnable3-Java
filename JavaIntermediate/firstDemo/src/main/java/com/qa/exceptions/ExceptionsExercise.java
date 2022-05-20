package com.qa.exceptions;

public class ExceptionsExercise {
	
	public int divideNums(int x, int y) {
		
		try {
			
			int result = x / y;
			
			if(y == 10) {
				throw new DivideTenException("Divided by 10!");
			}
			
			return result;
		} 
		
		catch (ArithmeticException e) {
			e.printStackTrace(); // Happens if we divide by 0
			return 0;
		} 
		
		catch (DivideTenException e) {
			e.printStackTrace(); // Happens if we divide by 10
			return 0;
		} 
		
		finally {  // Anything in finally, will run regardless of if an exception is thrown or not
			System.out.println("Will always run!");
		}
		

		
	}

}
