/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


/**
 *
 * @author angelos
 */
public class MouseMethods1 implements MouseListener{
    private JLabel label = new JLabel("This is a JLabel");
	private JButton button = new JButton("This is a JButton");
	
	public MouseMethods1() {
		JFrame frame = new JFrame("MouseMethods");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label.addMouseListener(this);
		button.addMouseListener(this);
		
		frame.add(label);
		frame.add(button);
		frame.setVisible(true);
		frame.pack();
		
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(button)){
			System.out.println("The JButton was clicked...");
		} else if(e.getSource().equals(label)){
			System.out.println("The JLabel was clicked...");
		} else {
			System.out.println("Something else was clicked...");
		}
		
	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	
	public static void main(String args[]) {
		new MouseMethods1();
	}
    
}
