package com.qa.main.day1;

// 'Ctrl + /' it makes this line into a comment 
// This text isn't read by Java, its just description

// When writing Java it is SUPER IMPORTANT ALL CODE GOES BETWEEN THE {}
public class Main {
	
	// Within Java, the only code that is ever ran is read from the 'main method'
	// At this stage this is just a 'magic' command that runs code
//	public static void main(String[] args) {
//		// Anything we want our code to do, must go inbetween the {}
//		
//		// System.out.println("some text"); -> print out to the console whatever text we put in
//		
//		// System.out.println("Hello 22AprEnable3!");
//		// System.out.println("Hello World.");
//		
//		// If I want to create a 'method' that my main method runs I must create the method separately 
//		// Write the name of the method you want to run ()
////		printMessages();
////		method1();
//		
//		// Java - Returns 
//		returnText(); // Saving a value "Hello Class!"
////		System.out.println(returnText()); // returnText() = "hello class!" 
//		
//		// Running a method from a different class
//		// Write down the name of the class
//		// followed by .nameOfMethod()
////		PrintClass.sayHello();
//		
//		// Print out the colour red using printRed()
////		System.out.println(OtherClass.printRed());
////		
////		System.out.println(Colours.blue());
////		System.out.println(Shapes.square());
//		// String concatenation 
////		System.out.println(Colours.red() + " " + Shapes.circle());
//		
////		System.out.println("*****************");
////		System.out.println(DataTypes.floatExample());
////		System.out.println(DataTypes.forceReturn());
////		System.out.println("__________________");
////		System.out.println(DataTypes.forceCasting());
//		
//		System.out.println(PrintName.returnGreeting("Pip"));
//		System.out.println(PrintName.returnGreeting("Reece"));
//	}
	
	// Make a new method called helloWorld that does the same thing as my main 
	// 'public static void' - magic words that make the method work
	// nameOfMethod() - lowerCamelCase + empty () 
	public static void printMessages() {
		// syso 'ctrl + space' -> Auto complete my System.out.println();
		System.out.println("Hello 22AprEnable3!");
		System.out.println("Hello world!");
	}
	
	// For the hello world exercise
	
	public static void method1() {
		// To make method1 run method2? 
		System.out.println("Method 1 running!");
		method2();
	}
	
	public static void method2() {
		// not returning, just printing to the console
		System.out.println("Method 2 running!");
	}
	
	
	// Java - Returns 
	// method to return some text
	// void - Don't return anything, if you want to return specify what data type 
	// String = text 
	public static String returnText() {
		// return "what I want to return";
		return "hello class!";
	}
	
}

// There shouldn't be ANYTHING under the }
