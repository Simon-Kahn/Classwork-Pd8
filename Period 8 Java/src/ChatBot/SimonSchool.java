package ChatBot;

public class SimonSchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop=true;
		while(inSchoolLoop){
			SimonMain.print("(Type 'quit' to go back.)");
			//static call on promptInput method from SimonMain class
			schoolResponse = SimonMain.promptInput();
		if(schoolResponse.indexOf("quit") >=0){
			inSchoolLoop = false;
			SimonMain.promptForever();
		}
			SimonMain.print("That's my favorite part " +"about school.");
		}

	}

	@Override
	public boolean isTriggered(String userInput) {
		if(SimonMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		return false;
	}

}
