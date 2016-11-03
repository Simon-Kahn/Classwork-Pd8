package caveExplorer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TwoDpractice {
	public static Scanner in =new Scanner(System.in);
	static String[][] arr2D;
	static String[][]pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	public static void main(String[] args) {
		arr2D = new String[5][5];
		pic = new String[5][5];
		for (int row = 0; row <arr2D.length;row++){
			for (int col = 0;col <arr2D[row].length;col++){
				arr2D[row][col]="("+row+", " +col+ ")";
			}
		}
			starti=2;
			startj=2;
			treasurei=4;
			treasurej=3;

			startExploring();
		






		//		boolean[][] mines = new boolean[15][100];
		//		plantMines(mines);
		//
		//		String[][] field = createField(mines);
		//		printPic(field);
		//		drawGrid(6,7);
	}
	private static void startExploring() {
		while(true) {
			System.out.println("You are in room " + arr2D[starti][startj] + ".");
			System.out.println("What do you want to do?");
			if(starti==treasurei&&startj==treasurej){
				System.out.println("YOU WIN");
				break;
			}
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];




		}


	}



	private static String[][] createField(boolean[][] mines) {
		// TODO Auto-generated method stub
		String[][] field = new String[mines.length][mines[0].length];
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
				if (mines[row][col])
					field[row][col] = "X";
				else {
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		return field;
	}
	private static int[] interpretInput(String input) {
		while (!isValid(input)){
			System.out.println("Sorry! in this game, you can only use WASD");
			System.out.println("tell me again what you would like to do");
			input=in.nextLine();
		}
		int currenti=starti;
		int currentj=startj;

		input = input.toLowerCase();
		if(input.equals("w")){
			currenti--;
		}
		if(input.equals("s")){
			currenti++;
		}
		if(input.equals("a")){
			currentj--;
		}
		if(input.equals("d")){
			currentj++;
		}
		int[] newCoordinates ={starti, startj};
		if(currenti>=0&&currenti<arr2D.length&&currentj>=0&&currentj<arr2D[0].length){
			newCoordinates[0]=currenti;
			newCoordinates[1]=currentj;
		}
		else{System.out.println("You feel your face hit a wall that you, for some inexplicable reason, chose to walk into."+"pick another direction");
		}
		return newCoordinates;
	}


	private static boolean isValid(String input) {
		String[] validKeys ={"w","a","s","d"};
		for(String key :validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}
	private static String countNearby(boolean[][] mines, int row, int col) {
		//		for (int r = row - 1; r < row + 1; r++) {
		//			for (int c = col - 1; c <= col + 1; c++) {
		//
		//				if(r>=0&&r<mines.length&& c>=0 && c<mines[0].length){
		//					
		//				}
		//			}
		//	
		//		}
		//this method only considers actual elements
		//		int count = 0;
		//		for(int r = 0; r< mines.length;r++){
		//			for (int c=0; c<mines[r].length;c++){
		//				if(Math.abs(r-row)+Math.abs(c-col)==1 && mines[r][c]){
		//					count++;
		//				}
		//			}
		//		}
		//	return""+ count;
		//this method allows you to be most specific
		//for example you only want north and east
		int count=0;
		count+=isValidAndTrue(mines,row-1,col);
		count+=isValidAndTrue(mines,row+1,col);
		count+=isValidAndTrue(mines,row,col-1);
		count+=isValidAndTrue(mines,row,col+1);
		return "" +count;
	}

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if(i>=0 && i <mines.length && j>=0&&j<mines[0].length&& mines[i][j])
			return 1;
		else return 0;
	}

	private static void plantMines(boolean[][] mines) {
		// TODO Auto-generated method stub
		int numberOfMines = 50;
		while (numberOfMines > 0) {
			int row = (int) (Math.random() * mines.length);
			int col = (int) (Math.random() * mines[0].length);
			// this prevents the same mine from being selected twice
			// while(mines[row][col]){
			// int row=(int)(Math.random()*mines.length);
			// int col=(int)(Math.random()*mines[0].length);
			// }
			if (!mines[row][col]) {
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

	public static void printPic(String[][] pic) {
		for (String[] row : pic) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.print("\n");
		}
	}

	public static void origStuff() {
		// String[] xox = {"x","o","x","o","x"};
		// System.out.println(Arrays.toString(xox));

		// String[][] arr2D = new String[5][4];

		// for (int row = 0; row < arr2D.length; row++) {
		// for (int col = 0; col < arr2D[row].length; col++) {
		// arr2D[row][col] = "(" + row + ", " + col + ")";
		// }
		// }

		//// every element in a 2D array is itself an array
		// for (String[] row : arr2D) {
		// System.out.println(Arrays.toString(row));
		// }

		String[][] pic = new String[8][8];

		for (int row = 0; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}

		for (int row = 7; row < pic.length; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = "w";
			}
		}
		pic[0][0] = "_";
		pic[0][1] = "_";
		pic[0][2] = "_";
		pic[0][3] = "_";
		pic[0][4] = "_";
		pic[0][5] = "_";
		pic[0][6] = "_";
		pic[0][7] = "_";

		pic[1][2] = "v";
		pic[1][5] = "v";
		pic[2][6] = "v";

		pic[2][2] = "\\";
		pic[2][3] = "|";
		pic[2][4] = "/";
		pic[3][1] = "-";
		pic[3][2] = "-";
		pic[3][3] = "O";
		pic[3][4] = "-";
		pic[3][5] = "-";
		pic[4][4] = "\\";
		pic[4][3] = "|";
		pic[4][2] = "/";

		pic[1][0] = "|";
		pic[2][0] = "|";
		pic[3][0] = "|";
		pic[4][0] = "|";
		pic[5][0] = "|";
		pic[6][0] = "|";

		pic[1][7] = "|";
		pic[2][7] = "|";
		pic[3][7] = "|";
		pic[4][7] = "|";
		pic[5][7] = "|";
		pic[6][7] = "|";

		pic[7][0] = "|";
		pic[7][1] = "_";
		pic[7][2] = "_";
		pic[7][3] = "_";
		pic[7][4] = "_";
		pic[7][5] = "_";
		pic[7][6] = "_";
		pic[7][7] = "|";

		for (String[] row : pic) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.print("\n");
		}

	}
	public static void drawGrid(int gridRow, int gridCol) {
		// String[] xox = {"x","o","x","o","x"};
		// System.out.println(Arrays.toString(xox));

		// String[][] arr2D = new String[5][4];

		// for (int row = 0; row < arr2D.length; row++) {
		// for (int col = 0; col < arr2D[row].length; col++) {
		// arr2D[row][col] = "(" + row + ", " + col + ")";
		// }
		// }

		//// every element in a 2D array is itself an array
		// for (String[] row : arr2D) {
		// System.out.println(Arrays.toString(row));
		// }

		String[][] pic = new String[((gridRow*3)+1)][((gridCol*3)+1)];

		for (int row = 0; row < gridRow; row++) {
			for (int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}



		for (String[] row : pic) 
			for (String col : row) {
				System.out.print(col);
			}
		System.out.print("\n");


	}

}