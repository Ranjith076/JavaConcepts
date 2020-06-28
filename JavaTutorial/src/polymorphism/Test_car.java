package polymorphism;

public class Test_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Static Polymorphism----> Compile time polymorphism
		Car_BMW c1 = new Car_BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		c1.theftsafety();
		
		System.out.println("***********************************");
		
		Car c2 = new Car();
		c2.start();
		c2.stop();
		c2.refuel();
		
		System.out.println("****** TOP CASTING ******");
		
		// Child class object can be referred by parent class variables ---> Runtime or Dynamic polymorphism
		Car c3= new Car_BMW(); 
		c3.start();
		c3.stop();
		c3.refuel();
		
		
		System.out.println("****** Down Casting ******");
	
		Car_BMW c4 = (Car_BMW)new Car();
		
	}

}
