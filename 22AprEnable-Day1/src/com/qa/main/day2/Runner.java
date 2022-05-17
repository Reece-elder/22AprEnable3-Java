package com.qa.main.day2;

import com.qa.main.day2.conditionals.BiggerDemo;
import com.qa.main.day2.conditionals.Calc;
import com.qa.main.day2.conditionals.CommunityExer;
import com.qa.main.day2.conditionals.Demo;
import com.qa.main.day2.iteration.Exercises;
import com.qa.main.day2.iteration.IterationDemo;
import com.qa.main.day2.paramater.BasicCalculator;

public class Runner {

//	public static void main(String[] args) {
		// for my main method to run returnGreeting()
//		System.out.println(BasicCalculator.returnGreeting("reece", "morning"));
		
		// Calculator stuff 
//		System.out.println(BasicCalculator.addSum(4, 5));
//		System.out.println(BasicCalculator.subSum(19, 7));
//		System.out.println(BasicCalculator.multiplySum(3, 4));
//		System.out.println(BasicCalculator.divideSum(15f, 2f));
//		System.out.println(BasicCalculator.squareSum(5));
//		
//		System.out.println(BasicCalculator.addThreeNums(2, 3, 4));
//		System.out.println(BasicCalculator.raisePower(3, 4));

//		Demo.basicExample();
//		Demo.nestingIfElse();
//		Calc.oddEven(638263291);
//		System.out.println(Calc.subSum(33, 3));
//		BiggerDemo.complexIfElse(9, "purple");
//		System.out.println(CommunityExer.fizzBuzz(15));
//		System.out.println(CommunityExer.fizzBuzz(9));
//		System.out.println(CommunityExer.fizzBuzz(10));
//		System.out.println(CommunityExer.fizzBuzz(4));
//		IterationDemo.whileDemo();
//		IterationDemo.doWhileDemo();
//		IterationDemo.forLoopDemo();
//		Exercises.flowchartExercise();		
//		Exercises.coins(123.50f, 310);
//	}
	
	public static void main(String[] args) {
		
		// Before I can run the methods from BiggerDemo, I need to make an object
		BiggerDemo demo = new BiggerDemo();
		// Running the methods of the OBJECTS
		demo.boolDemo(true);
		demo.complexIfElse(7, "red");
		
		// BiggerDemo.boolDemo(true); // Won't work, because the methods are instanced
		
		// Exercise - Find an old Class / project convert old methods to instanced
		// Make an object of your class in the runner, and run the new methods 
		// Suggestion - Convert your Calculator into instanced 
	}

}
