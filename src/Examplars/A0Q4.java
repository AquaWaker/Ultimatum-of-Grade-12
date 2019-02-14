/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examplars;

import java.util.Scanner;

/**
 *
 * @author pritb9521
 */
public class A0Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner for system input
        Scanner input = new Scanner(System.in);
        
        // Tells the user to enter a number
        System.out.println("Please enter a number between 1 and 10");
        
        int asterisks = input.nextInt();
        
        // Makes sure the number is in the requested range
        while (asterisks > 10 || asterisks < 1){
            System.out.println("That is not a valid number, please enter a number between 1 and 10");
            asterisks = input.nextInt();
        }
        
        // Make the row of Asterisks
        String Row = new String();
        for (int i = 0; i < asterisks; i++) {
            Row = Row + "*";
        }
        
        System.out.println(Row);
    }
}
