package java_exercises;

import javax.swing.*;
import java.awt.*;

public class DrawOval extends JPanel{
	
	private int d = 10; 
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(11, 11, d, d);
	
	}
	
	public void setD(int newD) {
		d = (newD >= 0 ? newD : 10);
		repaint();
		
	}
	
	public Dimension getPrefferredSize() {
		return new Dimension(200, 200);
		
	}
	
	public Dimension getMaximumSize() {
		return getPrefferredSize();
	}
}
