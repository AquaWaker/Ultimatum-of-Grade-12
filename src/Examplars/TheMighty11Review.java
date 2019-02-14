package Examplars;

import java.util.Scanner;

/**
 *
 * @author Brayden Pritchard
 */
public class TheMighty11Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing strings to the console
        System.out.println("Hello User");

        // Scanner for system input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        // Scans in the user's name
        String name = input.nextLine();

        System.out.println("Welcome " + name);

        // Determine the users age
        System.out.println("Please enter the year you were born: ");

        int age = 2019 - input.nextInt();

        System.out.println("You are " + age + " years old");

        if (age < 13) {
            System.out.println("Do you have your parent's permission to use this software?");
        } else if (age >= 60) {
            System.out.println("We shall make the text larger for you");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Welcome to the software");
        } else {
            System.out.println("You're not special...");
        }

        // get the user's marks and calculate the average
        double[] marks = new double[6];
        double average = 0;
        System.out.println("Please enter your marks on seperate lines");
        for (int i = 0; i < 6; i++) {
            // Scanning marks in 
            marks[i] = input.nextDouble();
        }
        // determine the averagte
        int spot = 0;
        while (spot < marks.length) {
            average = average + marks[spot];
            spot++;
        }
        average = average / marks.length;

        System.out.println("Your average is " + average);



    }
}
