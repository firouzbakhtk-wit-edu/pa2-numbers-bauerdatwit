package edu.wit.cs.comp1000;

/**
 * PA2A Submission
 * 
 * When you run this code it should ask for five whole numbers.
 * Once the five whole numbers are stored, it will calculate the sum of the positive numbers, negative numbers, and the sum of all numbers.
 * The program will also find the average of the positive numbers, negative numbers, and all numbers.
 * 
 * @author Dylan Bauer
 */

import java.util.Scanner; // Imports scanner utility

public class PA2a {

	/**
	 * Creates a new scanner object an array for the 5 input ints.
	 * There also also ints created for the total positive, negative, and total inputs.
	 * Ints are also created for the number of positive and negative inputs.
	 * Doubles are created for the averages of all, positive, and negative inputs.
	 * 
	 * @param args command-line arguments, ignored
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] userInputs = new int[5];
		int totalPositive = 0;
		int totalNegative = 0;
		int totalAll = 0;
		int numPositive = 0;
		int numNegative = 0;
		double avgPos = 0;
		double avgNeg = 0;
		double avgAll = 0;
		
		/**
		 * Below, the program will print a prompt for entering five whole numbers and the program will store these numbers in the array created above.
		 * It will also check each number in the array to see if it is positive or negative. It will then add them together to the either total positive or negative.
		 * Plus, the program will add a tick for every time there is a new positive or negative number.
		 */
		
		System.out.printf("Enter five whole numbers: ");
		
		for(int a = 0; a < 5; a++) {
			userInputs[a] = input.nextInt();
			totalAll += userInputs[a];
				if(userInputs[a] > 0) {
					totalPositive += userInputs[a];
					numPositive++;
				} else if(userInputs[a] <= 0) {
					totalNegative += userInputs[a];
					numNegative++;
				}
		}
		
		/**
		 * This section calculates the average positive, negative, and the total average and store them in the proper variables.
		 */
		
		if(numPositive > 0) {
			avgPos = (double) totalPositive / numPositive;
		}
		
		if(numNegative > 0) {
			avgNeg = (double) totalNegative / numNegative;
		}
		
		avgAll = (double) totalAll / 5;
		
		/**
		 * This section will print the results. If statements have been incorporated in order to have the correct grammar (either plural or non-plural)
		 */
		
		if(numPositive == 1) {
			System.out.printf("The sum of the %d positive number: %d%n", numPositive, totalPositive);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", numPositive, totalPositive);
		}
		
		if(numNegative == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", numNegative, totalNegative);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", numNegative, totalNegative);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n", totalAll);
		
		if(numPositive == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", numPositive, avgPos);
		}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", numPositive, avgPos);
		}
		
		if(numNegative == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", numNegative, avgNeg);
		}
		else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", numNegative, avgNeg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
		
		input.close(); // Closes scanner input
		
	}

}
