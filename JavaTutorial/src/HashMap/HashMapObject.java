package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Ranjith", 26, "TE");
		Employee e2 = new Employee("Vismaya", 22, "SE");
		Employee e3 = new Employee("Nisha", 26,"TA");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			
			int key = m.getKey();
			
			Employee e=m.getValue();
			
			System.out.println(key+". Employee info is");
			System.out.println(e.name+" "+e.age+" "+e.dept);
			
					
			
			
		}

	}

}
