/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public class Animal {
    String name;
    Double height;
    Double weigth;
   void speak(){
        System.out.println("το animal μίλησε!!");
    }
   Animal(String a, double b, double c){
       name=a;
       height=b;
       weigth=c;
   }
    
    
}
