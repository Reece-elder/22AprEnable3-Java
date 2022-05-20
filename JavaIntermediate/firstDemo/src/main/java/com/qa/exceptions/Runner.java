package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		ExceptionsDemo demo = new ExceptionsDemo();
//		demo.arrayException(); // This causes the exception stopping the app completely
		demo.handleException(); // When we handle an exception, the app still runs 
		System.out.println("Let's see if this prints.. ");
		demo.twoTypesExceptions();
		demo.makeNewException();
		
		ExceptionsExercise exer = new ExceptionsExercise();
		System.out.println(exer.divideNums(53, 7));
	}

}
