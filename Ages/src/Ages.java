/* 
 * Collin Mullis
 * January 20th 2016
 * Homework 1 Code
 * 
 */

// Imports the Scanner utility
import java.util.Scanner;  

// Defines class of Ages
public class Ages {

	// Main method
	public static void main(String[] args) {
		
		// Sets up the Scanner so it can look for input
		Scanner input = new Scanner(System.in);
		// Prompts your first command
		System.out.println("Enter your age in years: ");
		// Stores the next Integer entered
		int age = input.nextInt();
		// Prompts your second command
		System.out.println("Enter your weight in kilograms: ");
		// Stores the next Double entered 
		double weight = input.nextDouble();
		// Prints out the age and weight that was previously entered
		System.out.println("Your age is: " + age);
		System.out.println("Your weight is: " + weight);
		
		input.close();

	}

}
