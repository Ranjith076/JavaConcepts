package JavaBasics;

public class CallByValueAndCallByReference {
	
	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int res=obj.sum(a, b);// CALL BY VALUE
		System.out.println("Sum:"+res);
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj); // CALL BY REFERENCE
		System.out.println("After Swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	public int sum(int x, int y) {

		int res=x+y;
		return res;
	}
	
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
	
	
	

}
