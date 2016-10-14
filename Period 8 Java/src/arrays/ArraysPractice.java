package arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//FIRST METHOD: "FOR LOOP"
		//   - the index of the data is important to reference
		//   - you need to customize how you iterate 
		//(increase by 2, backwards, etc...)
		for(int index = 0; index< booleans.length; index ++){
			System.out.println(index+") "+booleans[index]); 
		}
		//SECOND METHOD: "FOR-EACH"
		//always goes in order, does not keep track of index
		//easier to type
		//don't need to customize
		//automatically assignes a "handle"
		for(boolean b: booleans){
			System.out.println(b+"");
		}
		//	OBJECT ARRAYS
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		
		for (String s: someStrings1){
			System.out.println(s);
		}

		//these two constructors are different
		String[] strings1 = {"","",""};
		String[] strings2 = new String[33];

		//this loop instantiating the strings
		for(int index =0; index < strings2.length; 
				index ++){
			strings2[index] = "value "+(index+1);
		}
	}
}
//Arrays
//Fixed length
//indices start at zero
//indexed (array)
//common data type (e.g. "student[]")
//arrays of any type must be Object[]
//		
//		if you want to put different primitive types into an array,
//you must use their Wrapper class
