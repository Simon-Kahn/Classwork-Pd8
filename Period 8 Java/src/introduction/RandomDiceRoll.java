package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int [6];
		// TODO Auto-generated method stub
		
		int totalRolls = 10000;
		for(int index= 0; index < totalRolls; index++){
			int result = rollFairDie();
			
			//int result = rollUnfairDie();
			System.out.println("Roll #" + (index+1) + ": "+result);
			//System.out.println("Roll #" + (index+1) + ": "+rollUnfairDie());
			results[result-1] ++;
		}

		for (int i = 0; i<6; i++){
			double percentage = ((int)(1000*(double)results[i]/totalRolls))/10.0;
			System.out.println((i+1) + " appeared " + percentage + " %");
		}

	}

	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){

		double rand =Math.random();//returns a double (0,1)
		int roll = (int) (6*rand);//[0,5]
		roll ++; //[1,6]
		return roll;
	}
	public static int rollUnfairDie(){
		int[] conceptualSides = {1,2,3,4,4,4,5,5,6};
		int conceptualOutcomes = conceptualSides.length; //length of array
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (conceptualOutcomes*rand);
		return conceptualSides[roll];
	}
}
