/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git__2024617;

import java.util.Scanner;

/**
 *
 * @author juman
 */
public class Git__2024617 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Jumana-2024617");
         Scanner myKB = new Scanner(System.in);  
        String userInput;

        // Do-while loop will keep asking for the name until valid input is provided
        do {
            // Ask the user to enter their name
            System.out.print("Please enter your name ");
            System.out.println("letters only, no numbers allowed:");
            userInput = myKB.nextLine().trim();   //Read input and remove any surrounding whitespace//

            // Check if the name contains only alphabetic characters (letter only )
            if (userInput.matches("[a-zA-Z]+")) {
                // If input is valid, perform string manipulations

           
                // Convert the name to uppercase
                String upperCaseName = userInput.toUpperCase();
                System.out.println("Your name in uppercase: " + upperCaseName);
                
                // Convert the input to lowercase
                String lowerCaseName = userInput.toLowerCase();
                System.out.println("Your name in lowercase: " + lowerCaseName);

               
                // Reverse the name using StringBuilder
                String reversedName = new StringBuilder(upperCaseName).reverse().toString();
                System.out.println("Your name reversed: " + reversedName);

                // Custom modification: Move the last letter to the front
                String modifiedName = reversedName.charAt(reversedName.length() - 1) + reversedName.substring(0, reversedName.length() - 1);
                System.out.println("Modified name: " + modifiedName);

                // Exit the loop after valid input
                break;//Break the loop since valid input has been processed//
            } 
            else {
                // If input contains numbers or special characters, show an error
                System.out.println("Error: Invalid input! Please enter a name with only letters (no numbers or special characters).");
            }
        } while (true);  // Continue the loop until a valid name is entered

        // Close the scanner to avoid resource leaks
        myKB.close();
    }
    
}
