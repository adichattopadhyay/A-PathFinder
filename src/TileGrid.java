import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;


public class TileGrid extends JFrame implements MouseListener {

	private static final long serialVersionUID = 4983727800375272097L;
	static int clicker = 0;
	
	
	
	public TileGrid(int sizeX, int sizeY) {
		setSize(sizeX, sizeY);
		setTitle("A*Pathfinding");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocation(0,0);
		
		setUpGrid(sizeX, sizeY);

		setResizable(false);
		
		addMouseListener(this);
	}

	private void setUpGrid(int sizeX, int sizeY) {
		getContentPane().setLayout(new GridLayout(sizeY / 50, sizeX / 50));
		int tileNum = 0;
		for (int i = 0; i < sizeX / 50; i++) {
			int iChange = i*48+17;
			System.out.println("I: " +iChange);
			for (int j = 0; j < sizeY / 50; j++) {
				getContentPane().add(new Tile(i * 48 + 17, j * 48 + 6, Color.white));
				int jChange = j*48+6;
				System.out.println("J: " +jChange);
				tileNum++;
				
			}
		}
		int[][] tileArray = new int[(int) Math.sqrt(tileNum)][(int) Math.sqrt(tileNum)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TileGrid frame = new TileGrid(1000, 1000);
		frame.setVisible(true); //Fix the frame thing to have a name

	}
	public int chooseColorChange() {
		if(clicker == 0) return 0;
		else if(clicker == 1) return 1;
		else return 2;
	}
	
	protected void paintComponent(Graphics g, int x, int y, int width, int height, Color c) {
		super.paintComponents(g);
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
	//Work on placement
	public void mouseClicked(MouseEvent arg0) {
//		int mouseX = (int) arg0.getPoint().getX();
//		int mouseY = (int) arg0.getPoint().getY();
//		System.out.println(mouseX);
//		System.out.println(mouseY);
//		int nearestX = mouseX/48*48+8;
//		int nearestY = mouseY/48*48+34;
//		System.out.println(nearestX);
//		System.out.println(nearestY);
//		if(clicker == 0) {
//			Graphics g = getGraphics();
//			paintComponent(g, nearestX, nearestY, 50, 50, Color.RED);
//			clicker = 0;
//			System.out.println("Placing start.");
//		}
	}
	
	

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

}
