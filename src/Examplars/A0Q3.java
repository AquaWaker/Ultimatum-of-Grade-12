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
public class A0Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello User");
        
        // Scanner for system input
        Scanner input = new Scanner(System.in);
        
        int[] costs = new int[6];
        
        int ticketCost = 35;
        
        // Scan the expenses and discover the total price
        double total = 0;
        System.out.println("Please enter the cost for each expense below:");
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print("Food: ");
            } else if (i == 1){
                System.out.print("DJ: ");
            } else if (i == 2){
                System.out.print("Hall Rental: ");
            } else if (i == 3){
                System.out.print("Decorations: ");
            } else if (i == 4){
                System.out.print("Wait Staff: ");
            } else if (i == 5){
                System.out.print("Miscellaneous: ");
            }
            
            costs[i] = input.nextInt();
            total = total + costs[i];
        }
        
        double ticketsSold = Math.ceil(total/ticketCost);
        
        System.out.println("You're total cost is " + total + 
                " \nAnd you need to sell " + ticketsSold + " tickets to break even");
       
        
    }
}
