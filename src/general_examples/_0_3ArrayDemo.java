/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

/**
 *
 * @author angelos
 */
public class _0_3ArrayDemo {
     public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
//        Similarly, you can declare arrays of other types:
//        byte[] anArrayOfBytes;
//        short[] anArrayOfShorts;
//        long[] anArrayOfLongs;
//        float[] anArrayOfFloats;
//        double[] anArrayOfDoubles;
//        boolean[] anArrayOfBooleans;
//        char[] anArrayOfChars;
//        String[] anArrayOfStrings;
        
//            You can also place the square brackets after the array's name:
//            this form is discouraged
//            float anArrayOfFloats[];
//            However, convention discourages this form; the brackets identify the array type and should appear 
        //with the type designation.
//        

        // allocates memory for 10 integers
        anArray = new int[10];
//        Alternatively, you can use the shortcut syntax to create and initialize an array:
//
//int[] anArray = { 
//    100, 200, 300,
//    400, 500, 600, 
//    700, 800, 900, 1000
//};
         for (int i = 1; i < 10; i=i+2) {
             anArray[i]=i;
         }
           
//        // initialize first element
//        anArray[0] = 100;
//        // initialize second element
//        anArray[1] = 200;
//        // etc.
//        anArray[2] = 300;
//        anArray[3] = 400;
//        anArray[4] = 500;
//        anArray[5] = 600;
//        anArray[6] = 700;
//        anArray[7] = 800;
//        anArray[8] = 900;
//        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
}
