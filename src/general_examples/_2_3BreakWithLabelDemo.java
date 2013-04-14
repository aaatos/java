/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package general_examples;

//An unlabeled break statement terminates the innermost switch, for, while, or do-while statement, 
//but a labeled break terminates an outer statement. 
//The following program, BreakWithLabelDemo, is similar to
//the previous program, but uses nested for loops to search 
//for a value in a two-dimensional array. When the value is found, 
//a labeled break terminates the outer for loop (labeled "search"):

//The break statement terminates the labeled statement; 
//it does not transfer the flow of control to the label. 
//Control flow is transferred to the statement immediately 
//following the labeled (terminated) statement.
public class _2_3BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
