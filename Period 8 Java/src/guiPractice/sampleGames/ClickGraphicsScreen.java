package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class ClickGraphicsScreen extends Screen implements MouseListener{

	private ClickableGraphic hand;
	
	public ClickGraphicsScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		hand = new ClickableGraphic(50, 50, .5, "resources/sampleImages/hand-gestures-oh.jpg");
		hand.setAction(new Action(){
				public void act() {
//				if(hand.getX()>getWidth()){
//					
//				}
					hand.setX(hand.getX() + 50);
					hand.setY(hand.getY() + 50);
				}
				
			});
		viewObjects.add(hand);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (hand.isHovered(e.getX(), e.getY())){
			hand.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
}