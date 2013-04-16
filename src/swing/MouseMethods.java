/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author angelos
 */
public class MouseMethods implements MouseListener{
    public MouseMethods() {
		JFrame frame = new JFrame("MouseMethods");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
                frame.addMouseListener(this);

		
		frame.setVisible(true);
		
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("The frame was clicked.");
		
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("The mouse entered the frame.");
		
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("The mouse exited the frame.");
		
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("The left mouse button was pressed.");
		
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("The left mouse button was released.");
		
	}
	
	public static void main(String args[]) {
		new MouseMethods();
	}
    
}
