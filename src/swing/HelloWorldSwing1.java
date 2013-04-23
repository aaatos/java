/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author angelos
 */
public class HelloWorldSwing1 {

    
   

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        //JLabel label = new JLabel("Hello World");
        //frame.getContentPane().add(label);
        //frame.add(label);
        
        
        //add a button
        //JButton button1=new JButton("Βόρεια");
        //frame.getContentPane().add(button);
        
        //add a second button
        //JButton button2=new JButton("Κεντρικά!!");
        //frame.getContentPane().add(button);
        
        //add a second button
        //JButton button3=new JButton("Νότια!!");
        //frame.getContentPane().add(button);
        
        //add a second button
        //JButton button4=new JButton("Ανατολικά!!");
        //frame.getContentPane().add(button);
        
        //add a second button
        //JButton button5=new JButton("Δυτικά!!");
        //frame.getContentPane().add(button);
        
        //using layoutmanager
        //frame.getContentPane().add(button1, BorderLayout.NORTH);
        //frame.getContentPane().add(button2, BorderLayout.CENTER);
       // frame.getContentPane().add(button3, BorderLayout.SOUTH);
        //frame.getContentPane().add(button4, BorderLayout.EAST);
        //frame.getContentPane().add(button5, BorderLayout.WEST);
        
        //Display the window.
        //frame.add(new Line(1,3,300,300));
        frame.pack();
        frame.setVisible(true);
    }
}
