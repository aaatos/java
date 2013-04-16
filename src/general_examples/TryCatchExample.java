/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

import java.util.Scanner;

/**
 *
 * @author angelos
 */
public class TryCatchExample {
    
    int div (int x, int y){
        return x/y;
    }
    
    public static void main(String[] args) {
        TryCatchExample object=new TryCatchExample();
        Scanner input=new Scanner(System.in);
        System.out.print("Δώσε τον πρώτο αριθμό ");
        int a=input.nextInt();
        System.out.print("Δώσε τον δεύτερο αριθμό ");
        int b=input.nextInt();
        System.out.print("To άθροισμα είναι: ");
        System.out.println(object.div(a,b));
        
    }
}
