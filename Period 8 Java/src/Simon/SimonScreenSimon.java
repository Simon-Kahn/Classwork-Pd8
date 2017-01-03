package Simon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiPractice.ClickableScreen;
import guiPractice.WhackAMole.MoleInterface;
import guiPractice.WhackAMole.PlayerInterface;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class SimonScreenSimon extends ClickableScreen implements Runnable {
	private ArrayList<MoveInterfaceSimon> mInterface;
	private ButtonInterfaceSimon[] bInterface;
	private TextLabel tLabel;
	private ProgressInterfaceSimon pInterface;
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;
	
	public SimonScreenSimon(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		pInterface = getProgress();
		tLabel = new TextLabel(130,230,300,40,"Let's play Simon!");
		mInterface = new ArrayList<MoveInterfaceSimon>();
		//add 2 moves to start
		lastSelectedButton = -1;
		mInterface.add(randomMove());
		mInterface.add(randomMove());
		roundNumber = 0;
		viewObjects.add(pInterface);
		viewObjects.add(tLabel);
		
	}

	private MoveInterfaceSimon randomMove() {
	Button b;
	//code that randomly selects a ButtonInterfaceX
	return getMove(b);
	}

	private MoveInterfaceSimon getMove(Button b) {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceSimon getProgress() {
		/*
		Placeholder until partner finishes implementation of ProgressInterface
		*/
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 5;
		Color = new Array[5];
		
	}

}
