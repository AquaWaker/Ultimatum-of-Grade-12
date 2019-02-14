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
public class A0Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing strings to the console
        System.out.println("Hello User");

        // Scanner for system input
        Scanner input = new Scanner(System.in);

        // Takes the three numbers and adds them together
        System.out.println("Please enter three numbers");
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }
        // Determines the root and the squared answers
        double root = Math.sqrt(sum);
        double squared = Math.pow(sum, 2);
        // outputs the numbers
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The root of the sum is " + root);
        System.out.println("The squared sum is " + squared);
        
    }
}
