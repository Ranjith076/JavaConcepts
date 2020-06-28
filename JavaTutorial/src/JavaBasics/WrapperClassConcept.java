package JavaBasics;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper classes are used to convert one data type to another data type.
		// Available wrapper classes: Integer, double, character and boolean
		
		String x= "100";
		System.out.println(x+20);
		
		//String to Integer conversion
		int y=Integer.parseInt(x);
		System.out.println(y+20);
	   
		//String to double conversion
		String p="22.33";
		double q=Double.parseDouble(p);
		System.out.println(q+100);
		
		//String to boolean
		String r ="true";
		Boolean s=Boolean.parseBoolean(r);
		System.out.println(s);
		
		//Integer to string conversion
		int a=100;
		System.out.println(a+10);
		
		String str=String.valueOf(a);
		System.out.println(str+10);
		
		//Number format exception
		Integer.parseInt("100A");
	}

}
