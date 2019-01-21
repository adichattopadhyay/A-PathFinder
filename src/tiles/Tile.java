package tiles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Tile extends JLabel{
	
	int x,y;
	int clicker = 0;
	private Color faceColor = Color.WHITE;
	private final static Dimension size = new Dimension(50,50);
	
	public Tile(int x, int y)
	{
		this.x = x;
		this.y = y;
		setBorder(BorderFactory.createLineBorder(Color.black));
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setOpaque(true);
		setBackground(Color.white);
	}
	
	public void setFaceColor(Color c) {
		this.faceColor = c;
		setBackground(faceColor);
	}
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public void startPlacement() {
		if(clicker ==0) {
			System.out.println("Placing start.");
			setFaceColor(Color.red);
			setBackground(Color.red);
		}
	}
	
	public void endPlacement() {
		if(clicker==1) {
			System.out.println("Placing end.");
			setFaceColor(Color.BLUE);
			clicker = 2;
		}
	}

	
}
