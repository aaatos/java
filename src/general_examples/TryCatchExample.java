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

    String div() {
        Scanner input = new Scanner(System.in);
        System.out.print("Δώσε τον πρώτο αριθμό (99999 για έξοδο) ");
        int a = input.nextInt();
        if (a == 99999) {
            return "exit";
        }
        System.out.print("Δώσε τον δεύτερο αριθμό ");
        int b = input.nextInt();
        return "To άθροισμα είναι: " + (a / b);

    }

    public static void main(String[] args) {
        String result="";
        boolean foundException = false;
        TryCatchExample object = new TryCatchExample();
        while ((!result.equals("exit")) && (foundException != true)) {
            try {
                result = object.div();
                if (result.equals("exit")) {
                    System.exit(0);
                }
            }
            catch (ArithmeticException ex) {
                System.out.println("ΠΡΟΣΟΧΗ!! Διαίρεση με το μηδέν.");
                
                        }
        }


    }
}

