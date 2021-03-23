package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println("The no. of rows is: "+ x.length);
		System.out.println("The no. of columns is: "+x[0].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "F";
		x[1][1] = "G";
		x[1][2] = "H";
		x[1][3] = "I";
		x[1][4] = "J";
		
		x[2][0] = "K";
		x[2][1] = "L";
		x[2][2] = "M";
		x[2][3] = "N";
		x[2][4] = "o";
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		

	}

}
