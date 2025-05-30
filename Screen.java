//screen template

import javax.swing.JPanel;
import java.awt.Graphics;

import java.awt.Color;

import java.awt.Dimension;

public class Screen extends JPanel{

    	public Screen(){
	       //screen constructor
	}

    	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
        	//draw things here
	}
}
