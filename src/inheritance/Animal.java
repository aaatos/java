/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public abstract class Animal {
    String name;
    Double height;
    Double weigth;
   abstract void speak();
    
   Animal(String a,double b, double c){
       name=a;
       height=b;
       weigth=c;
   }
    
    
}
