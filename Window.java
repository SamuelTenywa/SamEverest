package java_exercises;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Window extends JFrame{
	  
	private JSlider slider;
	private DrawOval myPanel;
	
	public Window() {
		super("The Slider");
		myPanel = new DrawOval();  
		myPanel.setBackground(Color.GRAY);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);  

		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e) {
						myPanel.setD(slider.getValue());
					}
				}
		);
		add(slider, BorderLayout.SOUTH);
		add(myPanel,BorderLayout.CENTER);
	}
	
}
