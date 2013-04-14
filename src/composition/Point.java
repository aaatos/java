/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author angelos
 */
public class Point {
    double x;
    double y;
    String name;
    static int counter=0;
    final double PI=3.1415;
    Point(double a, double b,String c){
        x=a;
        y=b;
        name=c;
        counter++;
    }
    void print(){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("name="+name);
    }
   
    
}
