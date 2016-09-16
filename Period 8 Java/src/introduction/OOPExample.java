package introduction;

public class OOPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jillian = new Senior("Jillian");
		Student joseph = new Student("Joseph");
		Student jordan = new Student("Jordan");
		Student sean = new Junior("Sean","Doctor");
	
		
	//	jillian.name = "Balonypants";
	//	jillian.talk();

		joseph.talk();
		jordan.talk();
		jillian.talk();
		((Junior)sean).talk();
	}

}
