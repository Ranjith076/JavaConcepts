package JavaBasics;

public class StaticAndNonstaticConcept {
	
	String name = "Tom";
	static int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Static variables or methods can be called directly or by using the class name.
		// Static methods or variables are not a part of the object created for a class.
		staticmethod();
		System.out.println(age);
		
		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		obj.globalmethod();
		System.out.println(obj.name);
		
		// Static methods or variables can be accessed by using an object referral.(Not a good practice-gives warning)
		obj.staticmethod();
		System.out.println(obj.age);

	}

	public void globalmethod() {
		
		System.out.println("Global method called");
	}
	
	public static void staticmethod() {
		
		System.out.println("Static method called");
	}

}
