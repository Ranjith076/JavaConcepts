package JavaBasics;

public class MethodOverloading {

	// When the method name is same with different arguments or input parameters within the SAME CLASS
	// We can overload main method also.
	// Creation of method inside a method is not allowed.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(30,40);
		obj.main(8);

	}
	
	public void main(int k) {
		
		System.out.println("Overloading main method");
		System.out.println(k);
		
	}
	
	public void sum() {
		System.out.println("Sum method with---> Zero Parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum method with----> 1 parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		
		System.out.println("Sum method ---> 2 parameter");
		System.out.println(i+j);
	}

}
