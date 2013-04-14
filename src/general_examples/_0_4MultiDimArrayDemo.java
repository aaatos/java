/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

//In the Java programming language, a multidimensional array is simply an array whose 
//components are themselves arrays. This is unlike arrays in C or Fortran. 
//A consequence of this is that the rows are allowed to vary in length, 
//as shown in the following MultiDimArrayDemoprogram:
public class _0_4MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names =new String[3][5];
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
