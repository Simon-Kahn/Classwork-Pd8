package Simon;

import guiPractice.GUIApplication;
import guiPractice.WhackAMole.WhackAMoleGame;
import guiPractice.WhackAMole.WhackAMoleScreen;

public class SimonGameSimon extends GUIApplication{

	public SimonGameSimon(int width,int height) {
		super(width, height);
	}
	@Override
	public void initScreen() {
		SimonScreenSimon wams = new SimonScreenSimon(getWidth(), getHeight());
		setScreen(wams);
				
	}
	public static void main(String[] args) {
		SimonGameSimon game = new SimonGameSimon(600, 500);
		Thread app = new Thread(game);
		app.start();
	}
}
