/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examplars;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pritb9521
 */
public class A0Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Tell the user the original population
        System.out.println("In 1999 the Earth's population was 6 billion...");
        
        // Calculate when the population would pass 10 billion
        int year = 1999;
        double population = 6e9;
        
        // Keep multplying for each year until it hits the number 
        while (population < 1e10){
            population = population * 1.014;
            year++;
        }
        
        System.out.println("The year that the population will exceed 10 billion is " + year);
    }
}
