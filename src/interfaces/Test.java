/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author angelos
 */
public class Test {
    Class1 class1;
    Class2 class2;
    Test(){
        class1=new Class1();
        class2= new Class2();
        
    }
    public static void main(String[] args) {
        Test test=new Test();
        Interface1[] anArray=new Interface1[2];
        anArray[0]=test.class1;
        anArray[1]=test.class2;
        for (Interface1 interface1 : anArray) {
            interface1.a();
            interface1.b(1);
        }
        Interface1 inf1=test.class1;
        System.out.println("for class1");
        inf1.a();
        
        inf1=test.class2;
        System.out.println("for class2");
        inf1.a();
    }
         
    
}
