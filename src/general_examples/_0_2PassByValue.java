/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;


/**
 *
 * @author angelos
 */
public class _0_2PassByValue {
    
    void ChangePrimitive(int a){
        a++;
        System.out.println("Inside ChangePrimitive a= "+a);
    }
    void ChangeDogsAge(Dog a){
        a.age=10;
        System.out.println("Inside ChangeDogsAge age= "+a.age);
    }
    class Dog{
        int age=0;
    }
    
    public static void main(String[] args) {
        _0_2PassByValue test=new _0_2PassByValue();
        int a=10;
        //PASSING PRIMITIVES
        System.out.println("Initial a="+a);
        test.ChangePrimitive(a);
        System.out.println("Outside ChangePrimitive a= "+a);
        //PASSING OBJECTS
        _0_2PassByValue.Dog MyDog=test.new Dog();
        System.out.println("Initial age of MyDog="+MyDog.age);
        test.ChangeDogsAge(MyDog);
        System.out.println("Outside ChangeDogsAge age= "+MyDog.age);
        
        
    }
    
}
