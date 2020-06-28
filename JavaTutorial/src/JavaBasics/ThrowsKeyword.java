package JavaBasics;

// Its used when there is a method chaining
// It can be handled by try catch block
// 'Throws' keyword is used next to the function name
// 'Throwable ' is the super class for all 'Error' and 'Exceptions'

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
	
	public void sum() {
		try {
			div();
		}catch(ArithmeticException e) {
			
		}		
	}
	
	public void div() throws ArithmeticException{
		
		int i = 9/0; // causes exception
	}

}
