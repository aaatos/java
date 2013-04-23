/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author angelos
 */
public  class Mammal extends Animal {

    void birthBabies() {
        System.out.println("Το θηλαστικό γέννησε!!");
        System.out.println(super.name);
    }
    void speak(){
        System.out.println("to thilastiko μίλησε");
        
    }



    public Mammal(String a, double y, double c) {
        super(a, y, c);
    }
}
