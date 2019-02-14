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
public class A0Q5 {

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
        
        // Makes a square of the inputed number in asterisk
        String[] Row = new String[asterisks];
        for (int i = 0; i < asterisks; i++) {
            Row[i] = "";
            for (int j = 0; j < asterisks; j++) {
                Row[i] = Row[i] + "*";
            }
            System.out.println(Row[i]);
        }
        
        
    }
}