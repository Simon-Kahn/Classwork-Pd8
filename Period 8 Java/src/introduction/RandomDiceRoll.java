package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int index= 0; index < 10; index++){
			System.out.println("Roll #" + (index+1) + ": "+rollFairDie());
			
		}
	}
	
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		
	double rand =Math.random();//returns a double (0,1)
	int roll = (int) (6*rand);//[0,5]
	roll++; //[1,6]
	return roll;
	}
	public static int rollUnfairDie(){

}
