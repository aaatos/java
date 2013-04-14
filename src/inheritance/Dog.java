/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public  class Dog extends Mammal {
    void speak(){
        System.out.println("Ο σκύλος μίλησε");
        
    }
    Dog(String a, double b, double c){
        super(a,b,c);
    }
    
}
