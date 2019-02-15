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
public class A0Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner for system input
        Scanner input = new Scanner(System.in);

        // exit loop variable
        String exit = "exit";
        // variable to hold a word
        String wordReturn = "";
        // Holds the first and last letter variables
        char first = ' ';
        char last = ' ';
        

        // Repeat checking for word and returning the first and last letter until user says 'exit'
        while (true) {
            System.out.println("Please enter a word longer then two letters: ");
            wordReturn = input.nextLine();
            if (wordReturn.length() < 2){
                System.out.println("Error, word is not longer then two letters, please enter a word longer then two letters:");
                wordReturn = input.nextLine();
            }
            if (exit.equalsIgnoreCase(wordReturn)) {
                break;
            }

            first = wordReturn.charAt(0);
            last = wordReturn.charAt(wordReturn.length() - 1);
            
            System.out.println("The first letter of the word is " + first +
                    " and the last letter is " + last);
            
        }
        // Thank the user for using the program
        System.out.println("Thank you for using this software");
    }
}
