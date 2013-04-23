/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author angelos
 */
public class Test {
     public static void main(String[] args) {
        Point point1=new Point(10.0, 20.0,"nikos");
         System.out.println("Αριθμός points "+Point.counter);
        point1.print();
        point1.x=45.5;
        point1.y=30.9;
        point1.print();
        
            
        Point point2=new Point(1, 15,"maria");
        System.out.println("Αριθμός points "+point1.counter);
        point2.print();
        
        
        
        
        
        
        
    }
    
}
