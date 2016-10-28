package Cave;
import java.util.Arrays;
public class caveExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] xox = {"x","o","x","o","x"};
		System.out.println(Arrays.toString(xox));
	
		String[][] arr2D = new String[5][4];
		System.out.println("the height is "+arr2D.length);
		System.out.println("the height is "+arr2D[0].length);
		for(int row=0; row<arr2D.length; row++){
	
			for (int col = 0; col < arr2D[row].length; col++) {
				arr2D[row][col] = "("+row+", "+col+")";
			}

		}
	//print 2D array
	//every element in a 2D array IS itself an array,
	//so a for-each loop looks like this:
		for(String[] row : arr2D){
		System.out.println(Arrays.toString(row));
		}
	}
}
