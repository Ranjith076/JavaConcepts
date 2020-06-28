package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap is a class implements map interface
		// Extends AbstractMap
		// it contains only unique elements
		// Stores in Key-Value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is not synchronized --- not thread safe
		// concurrent modification exception -- fail fast condition
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Selenium"); // Adding of Value
		hm.put(2,"QTP");
		hm.put(3,"Cucumber");
		hm.put(4,"RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(hm);
		hm.remove(3); // removal of Value
		System.out.println(hm);
		
		
	}

}
