package JavaBasics;

// It is used to throw used defined exception


public class ThrowKeyword {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Ranjith Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("DEF");

	}

}
