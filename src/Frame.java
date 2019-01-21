import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

import tiles.Tile;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Arrays;
public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4983727800375272097L;

	public Frame(int sizeX,int sizeY) {
		setSize(sizeX,sizeY);
		setTitle("A*Pathfinding");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setUpGame(sizeX,sizeY);
		
		setResizable(false);
		setVisible(true);
	}
	
	private void setUpGame(int sizeX,int sizeY) {
		getContentPane().setLayout(new GridLayout(sizeY/50,sizeX/50));
		int tileNum= 0;
		for(int i = 0; i<(sizeX*sizeY)/(50*50); i++) {
			getContentPane().add(new Tile());
			tileNum++;
		}
		int[][] tileArray = new int[(int) Math.sqrt(tileNum)][(int) Math.sqrt(tileNum)];
		System.out.println(Arrays.deepToString(tileArray));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame(1000,1000);
	}

}
