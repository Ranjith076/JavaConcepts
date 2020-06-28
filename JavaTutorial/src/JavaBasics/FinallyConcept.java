package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		division();
	}
	
	public static void division(){
		
		int i=10;
		
		try {
			
			System.out.println("Inside try block");
			int x=i/0;
		}
		catch(ArithmeticException e) {
			
			System.out.println("Inside Catch block");
		}
		finally {
			
			System.out.println("Inside finally block");
		}
		

	}
}
