package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2="Hello World";//same as above
		
		if (text1.equals (text2)){ //.equals es muy importante
			System.out.println("these strings are equal:");
		}
		prl(text1);
		prl(text2);
	
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
	
		if(word1.compareTo(word2) <0){
			prl("word1 comes before word2");
		}
	}
	public static void prl(String s){
		System.out.println(s);
	}
}
