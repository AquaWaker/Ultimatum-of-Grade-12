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
public class A0Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner for system input
        Scanner input = new Scanner(System.in);
        
        // Gets the number to stop at
        System.out.println("Please enter a number between 100 and 50");
        
        int countStop = input.nextInt();
        
        // Makes sure the user inputs a valid number
        if (countStop > 100 || countStop < 50){
            System.out.println("Invalid number, Please enter a number between 100 and 50");
            
            countStop = input.nextInt();
        }
        
        // Counts backwards by five until it would go under the inputed value
        int countDown = 100;
        for (int count = 0; count < 10; count++) {
            if(countDown <= countStop){
                count = 9;
            } else {
                System.out.println(countDown);
                countDown = countDown - 5;
            }
            
        }
        
    }
}
