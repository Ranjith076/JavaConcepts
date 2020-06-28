package Interface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(USBank.Min_bal);
		 ICICIBank ib = new ICICIBank();
		 
		 ib.Credit();
		 ib.Debit();
		 ib.transfer();
		 ib.Homeloan();
		 ib.AdhaarLink();
		 
		 System.out.println("Accessing methods using US Bank");
		 USBank ub=new ICICIBank();
		 
		 ub.Credit();
		 ub.Debit();
		 ub.transfer();
		 
		  
	}

}
