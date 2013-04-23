/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.Scanner;

/**
 *
 * @author angelos
 */
public class Point {
    double x;
    double y;
    String name;
    static int counter=0;
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
    void move(double a, double b){
        x=a;
        y=b;
    }
    void delete(){
        x=0;
        y=0;
    }
    void setX(){
        Scanner input =new Scanner(System.in);
        System.out.println("Δώσε χ ");
        double temp=input.nextDouble();
        x=temp;
    }
    void setY(){
        Scanner input =new Scanner(System.in);
        System.out.println("Δώσε y ");
        double temp=input.nextDouble();
        y=temp;
    }
    double getX(){
        return x;
    }
     double getY(){
        return y;
    }
    public static void main(String[] args) {
        Point a=new Point(10.0, 20.0, "my first point");
        //Point b=new Point(30.0, 50.0, "my second point");
        a.print();
        a.move(34.5,56.8);
        a.print();
        a.delete();
        a.print();
        a.setX();
        a.print();
        //b.print();
    }
   
    
}
