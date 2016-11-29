package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		System.out.println("Using a for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello world! x" + i);
		}
		System.out.println("Without using a for loop");
		forLoop(5, new Action() {
			private int value =0;
			public void act() {
				System.out.println("Hello world! x"+value);
				value++;
		
			}
		});
	System.out.println(""+fac(21));
	hanoiSolution(3,"A","B","C");
	}

	private static void forLoop(int i, Action action) {
		if (i <= 0) {
			// base case
			return;
		} else {
			action.act();
			// recursive call
			forLoop(i - 1, action);
		}

	}

	private static int fac(int i){
		if (i == 1) {
			// base case
			return i;
		}else{
		return i*fac((i-1));
		}
	
	}
public static void hanoiSolution(int numberofDiscs, String startPeg, String midPeg, String endPeg){
	if(numberofDiscs<=1){
		System.out.println("move "+startPeg+" to "+endPeg);
	}else{
		hanoiSolution(numberofDiscs-1, startPeg,endPeg,midPeg);
		hanoiSolution(1,startPeg,midPeg,endPeg);
		hanoiSolution(numberofDiscs-1,midPeg,startPeg,endPeg);
	}
}
	
}
