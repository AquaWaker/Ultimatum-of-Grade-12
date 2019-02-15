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
public class A0Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner for system input
        Scanner input = new Scanner(System.in);
        
        // Get the 10 words from the user
        System.out.println("Please enter ten words of your choice");
        
        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
        }
        
        // Determine the average length of the words
        double aveWordLength = 0;
        for (int i = 0; i < 10; i++) {
            aveWordLength = aveWordLength + words[i].length();
        }
        aveWordLength = Math.ceil(aveWordLength/10);
        
        System.out.println("The average word length is " + aveWordLength + " words");
        
    }
}
