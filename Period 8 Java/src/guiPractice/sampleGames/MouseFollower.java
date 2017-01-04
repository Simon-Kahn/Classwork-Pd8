package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	public MouseFollower(int width2, int height2) {
		super(width2, height2);
		// TODO Auto-generated constructor stub
	}
	public static CoordinateScreen coordScreen;
	public static MovementScreen moveScreen;
	public static MouseFollower game;
	
	public static void main (String[] args){
		game= new MouseFollower(800, 500);
		Thread app = new Thread(game);
		app.start();
	
	}
	@Override
	protected void initScreen() {
		moveScreen = new MovementScreen(getWidth(),getHeight());
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}