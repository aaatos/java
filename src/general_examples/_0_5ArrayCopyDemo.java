/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

/**
 *
 * @author angelos
 */
public class _0_5ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
//The two Object arguments specify the array to copy from and the array to copy to. 
//The three int arguments specify the starting position in the source array, 
//the starting position in the destination array, and the number of array elements to copy.
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
