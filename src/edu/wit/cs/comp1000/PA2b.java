package edu.wit.cs.comp1000;

/**
 * PA2B Submission
 * 
 * When you run this code it should ask for 3 inputs (a, b, and c). They will be stored as doubles and calculated through the quadratic formula.
 * The program will let you know if the roots are imaginary. If the roots are not imaginary, it will either spit out the root or roots (depending)
 * 
 * @author Dylan Bauer
 */

import java.util.Scanner; // Imports scanner utility

public class PA2b {

	/**
	 * Creates 4 doubles, 3 for the inputs and one for the discriminant. It also creates a new scanner object for the user input.
	 * It will then continue to collect the user inputs with a prompt in the console
	 * 
	 * @param args command-line arguments, ignored
	 */
	
	public static void main(String[] args) {
		
		double input_a;
		double input_b;
		double input_c;
		double disc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
		input_a = input.nextDouble();
		input_b = input.nextDouble();
		input_c = input.nextDouble();
		
		disc = (input_b * input_b) - 4 * input_a * input_c; // Formula for discriminant
		
		/**
		 * Below it will calculate the roots. If the discriminant is less than zero, it will output that the roots are imaginary.
		 * If the discriminant is equal to zero it will only calculate and output the singular root.
		 * If the discriminant is greater than 0 it will find and output both of the roots.
		 */
		
		if(disc < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		
		else if(disc == 0) {
			disc = -input_b / (2 * input_a);
			System.out.printf("Root: %.2f%n", disc);
		}
		
		else {
			double root1 = (-input_b + Math.sqrt(disc)) / (2 * input_a);
			double root2 = (-input_b - Math.sqrt(disc)) / (2 * input_a);
			
			if(root1 > root2) {
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
			
		}
	
		input.close(); // Closes scanner object
		
	}

}
