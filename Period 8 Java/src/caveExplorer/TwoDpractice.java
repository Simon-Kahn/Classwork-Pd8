package caveExplorer;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDpractice {

	public static void main(String[] args) {
//		String[] xox = {"x","o","x","o","x"};
//		System.out.println(Arrays.toString(xox));
	
//		String[][] arr2D = new String[5][4];
	
//		for (int row = 0; row < arr2D.length; row++) {
//			for (int col = 0; col < arr2D[row].length; col++) {
//				arr2D[row][col] = "(" + row + ", " + col + ")";
//			}
//		}
		
////		every element in a 2D array is itself an array
//		for (String[] row : arr2D) {
//			System.out.println(Arrays.toString(row));
//		}
		
		
		
		String[][] pic = new String[10][8];
		
		for (int row = 0; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}

		pic[0][3]="|";
		pic[0][4]="/";
		pic[1][3]="O";
		pic[2][3]="|";
		pic[1][2]="-";
		pic[1][4]="-";
		
		//grassy field
		for (int row = 5; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = "w";
			}
		}
		for (String[] row : pic) {
			for (String col : row){
				System.out.print(col);
			}
			System.out.print("\n");
		}
		
	}
	
}