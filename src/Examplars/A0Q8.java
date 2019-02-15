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
public class A0Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner for system input
        Scanner input = new Scanner(System.in);
        // The number of years it takes to earn a specific amount
        int years = 0;
        
        // Get the balance and the interest rate of the account
        System.out.println("Please enter your initial balance:");
        
        double balance = input.nextDouble();
        // Get double of the balance
        double doubledBalance = balance*2;
        
        System.out.println("Please enter the interest rate:");
        
        double rate = (input.nextDouble() / 100) + 1;
        
        // Count how many years it takes for the money to double
        while (balance < doubledBalance){
            balance = balance*rate;
            years++;
        }
        
        System.out.println("In " + years + " years the money will double");
        
        // count how many years it takes for the money to be one million
        while (balance < 1e6){
            balance = balance*rate;
            years++;
        }
        
        System.out.println("In " + years + " years the money will be one million dollars");
        
    }
}
