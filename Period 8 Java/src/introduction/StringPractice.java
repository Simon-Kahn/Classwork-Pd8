package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2="Hello World";//same as above
		
		if (text1.equals (text2)){
			System.out.println("these strings are equal:");
		}
	prl(text1);
	prl(text2);
	
	}
public static void prl(String s){
	System.out.println(s);
}
}
