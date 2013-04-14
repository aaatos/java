/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public class Test {
    public static void main(String[] args) {
        Mammal myMammal=new Mammal("myMammal", 13.7, 87.0);
        myMammal.speak();
        Dog myDog=new Dog("azor", 34.6, 67.0);
        myDog.speak();
        
    }
    
}
