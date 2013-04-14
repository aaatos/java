/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

//+       additive operator (also used for 
//        String concatenation)
//-       subtraction operator
//*       multiplication operator
///       division operator
//%       remainder operator
public class _0_6ArithmeticDemo {
     public static void main (String[] args){
         
        // result is now 3
        int result = 1 + 2;
        System.out.println(result);

        // result is now 2
        result = result - 1;
        System.out.println(result);

        // result is now 4
        result = result * 2;
        System.out.println(result);

        // result is now 2
        result = result / 2;
        System.out.println(result);

        // result is now 10
        result = result + 8;
        // result is now 3
        result = result % 7;
        System.out.println(result);
    }
}
