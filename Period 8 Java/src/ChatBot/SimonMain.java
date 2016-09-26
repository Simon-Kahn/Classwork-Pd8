package ChatBot;
import java.util.Scanner;

public class SimonMain {

	static Scanner input;
	static String user;
	static String response;
	static boolean inMainLoop;
	//list all chatbots available under this class
	static Chatbot school;
	public static void main(String[] args) {
		
		createFields();
	//	demostrateStringMethods();
		promptName();
	//promptInput();
		promptForever();
	
	}

	private static void promptName() {
		print("Hello!\n What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you "+user+" until you terminate me.");
	}

	public static void promptForever(){
		inMainLoop = true;
		while(inMainLoop){
			print("hi, " + user+ ". How are you?");
			response = promptInput();
			if(findKeyword(response, "good", 0) >=0){
				print("That's wonderful. "+ "So glad you feel good.");
			
			}
			
			else if(response.indexOf("school")>=0){
				print("School is great! tell me about school.");
				inMainLoop = false;
				school.talk();
			
			}
			
			else{
				print("I dont understand");
			}
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startPsn) {
	//delete white space
		searchString = searchString.trim();
		
	//make lowercase
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		int psn = searchString.indexOf(0);
		while(psn >= 0){
			String before = " ";
			String after = " ";
			if(psn > 0){
				before = searchString.substring(psn-1, psn);
			}
			if(psn+ keyword.length() > searchString.length()){
				after = searchString.substring(psn+ keyword.length(), psn+ keyword.length()+1);
			
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return psn;
			}
			else{
				psn = searchString.indexOf(keyword, psn+1);
			}
		}
		
		return -1;
	}

	
	
	
	
	
	
	
	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
		
	}
	
	public static void print(String s){
		String printString = "";
int cutoff = 35;
while(s.length() > 0){
	String cut ="";
	String nextWord="";
//	//shorten the cut to end on a space
//	for(int i=0; i*cutoff <s.length(); i++){
//	printString += getCut(s, cutoff, i+1) +"\n";
//}

	while(cut.length() + nextWord.length() < cutoff && s.length()>0){
		
		cut += nextWord;
	 s = s.substring(nextWord.length());
		
		
		
		int endOfWord = s.indexOf(" ");
		if(endOfWord == -1){
			endOfWord = s.length() - 1; 
		}
		nextWord= s.substring(0, endOfWord + 1);
	
	}
	printString += cut+"\n";
}
System.out.println(printString);
	}

//	private static String getCut(String s, int cutoff, int cut){
//		//int cut = 1;
//		
//		int cutIndex = cut * cutoff;
//		if(cutIndex > s.length())cutIndex = s.length();
//		String currentCut = s.substring(0,cutIndex);
//		
//		int indexOfLastSpace=currentCut.length()-1;
//		
//		for(int i = currentCut.length()-1;i>=0;i--){
//		String letter =currentCut.substring(i, i++);
//		if(letter.equals(" ")){
//			indexOfLastSpace = i;
//			break;
//			}
//		}
//		currentCut = currentCut.substring(0, indexOfLastSpace);
//		return currentCut;
//		
//	}
//	
//	
	
	
	
	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
		school = new SimonSchool();
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
