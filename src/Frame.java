import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import tiles.Tile;

import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Frame extends JFrame implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4983727800375272097L;

	int clicker = 0;

	public Frame(int sizeX, int sizeY) {
		setSize(sizeX, sizeY);
		setTitle("A*Pathfinding");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setUpGrid(sizeX, sizeY);

		setResizable(false);
		setVisible(true);
		addMouseListener(this);
	}

	private void setUpGrid(int sizeX, int sizeY) {
		getContentPane().setLayout(new GridLayout(sizeY / 50, sizeX / 50));
		int tileNum = 0;
		for (int i = 0; i < sizeX / 50; i++) {
			for (int j = 0; j < sizeY / 50; j++) {
				getContentPane().add(new Tile(i * 48 + 17, j * 48 + 6, Color.white));
				tileNum++;
				
			}
		}
		int[][] tileArray = new int[(int) Math.sqrt(tileNum)][(int) Math.sqrt(tileNum)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame(1000, 1000);
	}

	public void mouseClicked(MouseEvent arg0) {
		int mouseX = (int) arg0.getXOnScreen();
		int mouseY = (int) MouseInfo.getPointerInfo().getLocation().getY();
		System.out.println(mouseX);
		System.out.println(mouseY);
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
