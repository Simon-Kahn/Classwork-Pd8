package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {
	private CoordinateScreen coordScreen;
	
	public MouseFollower() {

	}

	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
