

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;


public class Tile extends JLabel implements MouseListener{

	private static final long serialVersionUID = 3626025279172301667L;
	int x, y;
	int clicker = 0; 
	private final static Dimension size = new Dimension(50, 50);

	public Tile(int x, int y, Color c){
		this.x = x;
		this.y = y;
		setBorder(BorderFactory.createLineBorder(Color.black));
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setOpaque(true);
		setBackground(c);
		addMouseListener(this);
	}


	public void changeColor(Color c) {
		setBackground(c);
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent e) {		
	}
	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
	

}
