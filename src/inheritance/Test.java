/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import com.sun.jndi.url.dns.dnsURLContext;

/**
 *
 * @author angelos
 */
public class Test {
    public static void main(String[] args) {
        //Animal zoo=new Animal("zoaki", 12.0, 34.0);
        Mammal thilastiko=new Mammal("thilastiko", 3.0, 6.7);
        Dog skilos=new Dog("skilos", 30.6, 23.6);
        
        
        //zoo.speak();
        thilastiko.speak();
        skilos.speak();
        skilos.birthBabies();
        
    }
    
}
