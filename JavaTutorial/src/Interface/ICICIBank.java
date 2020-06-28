package Interface;

public class ICICIBank implements USBank, IndianBank { 
	
	//IS-A relationship: Its between Interface and class.
	// If a class is implementing any interface, then it is mandatory to define or override all methods of interface.
	public void Credit() {
		
		System.out.println("ICICI implements US bank Credit");
	}
	
	public void Debit() {
		
		System.out.println("ICICI implements US bank Debit");
	}
	
	public void transfer() {
		
		System.out.println("ICICI implements US bank transfer");
	}
	
	//Method from IndianBank overridden and defined
	public void AdhaarLink() {
		
		System.out.println("ICICI implements Adhaar link");
	}
	
	// seperate method of ICICIBank
	public void Homeloan() {
		
		System.out.println("ICICI provides home loan");
	}

}
