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
public class A0Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing strings to the console
        System.out.println("Hello!!");

        // Scanner for system input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");

        // Scans in the user's name
        String name = input.nextLine();

        // Repeats their name back
        System.out.println("Welcome " + name + "!!");
    }
}
