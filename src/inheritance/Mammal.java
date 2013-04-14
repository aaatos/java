/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public class Mammal extends Animal{
    void birthBabies(){
        System.out.println("Το θηλαστικό γέννησε!!");
    }
    void speak(){
        System.out.println("Το θηλαστικό μίλησε");
    }
    public Mammal(String a, double b, double c) {
        super(a, b, c);
    }
    
    
}
