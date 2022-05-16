package firstDemo.com.qa.main;

public class Runner {
	
	// Adding a testing framework (JUnit Jupiter) to our project 

	public static void main(String[] args) {
		System.out.println("Hey, is this working?");
		
		SayHello greeting = new SayHello();
		System.out.println(greeting.sayHello());

	}

}
