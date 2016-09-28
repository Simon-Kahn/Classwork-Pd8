package ChatBot;

public class SimonHello implements Chatbot{
private String helloResponse;
private boolean inHelloLoop;

private String[] calmResponses = {
		"We already said hello. "
		+ "Let's move the conversation along.", "You said hello already, did you forget?"};
private String[] angryResponses = {"Okay, really stop saying hi.", "Wyd fam u said hello"}; 
	private int helloCount;
	
	
	
	
	
	
	public void talk(){
	inHelloLoop = true;
	while(inHelloLoop){
		helloCount++;
		printResponse();
		helloResponse = SimonMain.promptInput();
		if(!isTriggered(helloResponse)){
			inHelloLoop = false;
			SimonMain.promptForever();
		}
	}
}
private void printResponse() {
	if(helloCount > 4){
		int responseSelection = (int)(Math.random()*angryResponses.length);
		SimonMain.print(angryResponses[responseSelection]);
	}
	
	else{
		
		int responseSelection = (int)(Math.random()*calmResponses.length);
		SimonMain.print(calmResponses[responseSelection]);
		
	}
	}






public boolean isTriggered(String userInput){
	if(SimonMain.findKeyword(userInput, "hello", 0)>= 0){
		return true;
	}
	return false;
}
}

