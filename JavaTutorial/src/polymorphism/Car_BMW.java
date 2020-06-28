package polymorphism;

public class Car_BMW extends Car { // has-a relationship
	
	/*When a method with same name and arguments is present at the parent class as 
	well as the in the child class then it is called the method overriding.*/
	
	public void start() {
		
		System.out.println("BMW--> start");
	}
	
	public void stop() {
		
		System.out.println("BMW--> stop");
	}
	
	public void theftsafety() {
		
		System.out.println("BMW--> Theft safety");
	}
}
