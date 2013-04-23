/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author angelos
 */
public class Line {
    Point start;
    Point end;
    Line(Point a, Point b){
        start=a;
        end=b;
    }
    double lenght(){
        return Math.hypot((end.x-start.x), (end.y-start.y));
    }
    void move(double a1,double a2,double b1, double b2){
        start.move(a1, a2);
        end.move(b1, b2);
    }
    void delete(){
        start.delete();
        end.delete();
    }
    
    public static void main(String[] args) {
        Point a=new Point(13.5,34.6,"p1");
        Point b=new Point(15.5,56.6,"p2");
        Line myLine=new Line(a, b);
        myLine.move(23.5, 10.0, 30.5, 34.6);
        
    }
    
}
