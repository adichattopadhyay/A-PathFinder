package tiles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Tile extends JLabel{
		
	private Color faceColor = Color.WHITE;
	private final static Dimension size = new Dimension(50,50);
	
	public Tile()
	{
		setBorder(BorderFactory.createLineBorder(Color.black));
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setOpaque(true);
		setBackground(Color.white);
	}
	
	protected void setFaceColor(Color c) {
		this.faceColor = c;
	}
	
}
