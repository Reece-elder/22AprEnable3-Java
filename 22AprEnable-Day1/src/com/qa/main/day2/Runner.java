package com.qa.main.day2;

import com.qa.main.day2.paramater.BasicCalculator;

public class Runner {

	public static void main(String[] args) {
		// for my main method to run returnGreeting()
		System.out.println(BasicCalculator.returnGreeting("reece", "morning"));
		
		// Calculator stuff 
		System.out.println(BasicCalculator.addSum(4, 5));
		System.out.println(BasicCalculator.subSum(19, 7));
		System.out.println(BasicCalculator.multiplySum(3, 4));
		System.out.println(BasicCalculator.divideSum(15f, 2f));
		System.out.println(BasicCalculator.squareSum(5));
		
		System.out.println(BasicCalculator.addThreeNums(2, 3, 4));
		System.out.println(BasicCalculator.raisePower(3, 4));

	}

}
