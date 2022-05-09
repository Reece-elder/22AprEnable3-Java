package com.qa.main;

// 'Ctrl + /' it makes this line into a comment 
// This text isn't read by Java, its just description

// When writing Java it is SUPER IMPORTANT ALL CODE GOES BETWEEN THE {}
public class Main {
	
	// Within Java, the only code that is ever ran is read from the 'main method'
	// At this stage this is just a 'magic' command that runs code
	public static void main(String[] args) {
		// Anything we want our code to do, must go inbetween the {}
		
		// System.out.println("some text"); -> print out to the console whatever text we put in
		
		// System.out.println("Hello 22AprEnable3!");
		// System.out.println("Hello World.");
		
		// If I want to create a 'method' that my main method runs I must create the method separately 
		// Write the name of the method you want to run ()
		printMessages();
	}
	
	// Make a new method called helloWorld that does the same thing as my main 
	// 'public static void' - magic words that make the method work
	// nameOfMethod() - lowerCamelCase + empty () 
	public static void printMessages() {
		// syso 'ctrl + space' -> Auto complete my System.out.println();
		System.out.println("Hello 22AprEnable3!");
		System.out.println("Hello world!");
	}
	
}

// There shouldn't be ANYTHING under the }
