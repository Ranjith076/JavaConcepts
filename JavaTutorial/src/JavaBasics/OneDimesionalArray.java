package JavaBasics;

public class OneDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Integer Array
		int i[]=new int[4];
		i[0]=57;
		i[1]=89;
		i[2]=34;
		i[3]=56;
		System.out.println(i[0]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) 
		{
			System.out.println(i[j]);
		}
		
		// Object Array: used to store values with different data types
		
		Object ob[]=new Object[4];
		ob[0]="Ranjith";
		ob[1]=27;
		ob[2]=50.2;
		ob[3]=true;
		
		for(int k=0;k<ob.length;k++) 
		{
			System.out.println(ob[k]);	

		}
	}
}
