package introduction;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String users;
	
	public static void main(String[] args) {
		
		createFields();
	//	demostrateStringMethods();
		promptName();
	//promptInput();
		talkForever();
	}

	private static void promptName() {
		print("Hello!\n What is your name?");
		users = input.nextLine();
		print("Awesome! I will call you "+users+" until you terminate me. hoooooooooooooooooooooooray yay");
	}

	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
	public static void promptInput() {
		print(users+", try typing something!");
		String userInput = input.nextLine();
		print("You typed "+userInput);
		
	}
	
	public static void print(String s){
		String printString = s;
int cutoff = 45;
if(printString.length() > cutoff){

	//shorten the cut to end on a space
	for(int i=0; i*cutoff <s.length(); i++){
	printString += getCut(s, cutoff, i+1) +"\n";
}
}
System.out.println(printString);
	}

	private static String getCut(String s, int cutoff, int cut){
		//int cut = 1;
		
		int cutIndex = cut * cutoff;
		if(cutIndex > s.length())cutIndex = s.length();
		String currentCut = s.substring(0,cutIndex);
		
		int indexOfLastSpace=currentCut.length()-1;
		
		for(int i = currentCut.length()-1;i>=0;i--){
		String letter =currentCut.substring(i, i++);
		if(letter.equals(" ")){
			indexOfLastSpace = i;
			break;
			}
		}
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
		
	}
	
	
	
	
	
	public static void createFields() {
		input = new Scanner(System.in);
		
	}
	
	public static void demostrateStringMethods(){
		
//		String text = new String("Hello World");
		String text1 = "Hello World";//same as the one above this code (line 6)
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2 + text3)){
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2 + text3);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0)
			System.out.println("Word1 is before word2," + " lexicongraphically.");
		
	}

}
