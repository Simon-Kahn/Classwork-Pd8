package introduction;

public class Junior extends Student {

public String occupation;
	public Junior(String name, String occupation) {
		super(name);
		this.occupation = occupation;
		// TODO Auto-generated constructor stub
	}
	public void talk(){
	super.talk();
	System.out.println("... and I am a junior! when I grow up I want to be a " + occupation +".");
	}

}
