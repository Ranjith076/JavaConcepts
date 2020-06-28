package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();// Used to store values of any data type
		
		ar.add(100);
		ar.add("Tom");
		ar.add(20.0);
		
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Tom");-----------> Error
		
		
		

	}

}
