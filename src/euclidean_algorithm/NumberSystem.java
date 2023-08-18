package euclidean_algorithm;

public class NumberSystem {
	
	/**
	 * Precondition: a and b are positive integers.
	 * Returns the greatest common factor of a and b.
	 */
	public static int gcf(int a, int b) {
	  // If a is evenly divisible by b, the GCF is b.
	  if (a % b == 0) {
	    return b;
	  }

	  // If a is not evenly divisible by b, the GCF of a and b equals
	  // the GCF of b and the remainder when a is divided by b.
	  return gcf(b, a % b);
	}
	
	/**
	 * Precondition: a and b are positive integers.
	 * Prints the fraction numerator/denominator in lowest terms.
	 */
	public static void reduceFraction(int numerator, int denominator) {
		// Obtain the GCF of the numerator and denominator using the `gcf()` static method:
		int gcf = NumberSystem.gcf(numerator, denominator);
		
		// Reduce the numerator and denominator by dividing them by the GCF:
		int reducedNumerator = numerator / gcf;
		int reducedDenominator = denominator / gcf;
		
		// Print the reduced form of numerator/denominator:
		System.out.println(numerator + "/" + denominator + " = "
							+ reducedNumerator + "/" + reducedDenominator);
	}
	
	// Main method to test the code
	public static void main(String[] args) {
		int numerator = 24;
		int denominator = 9;
		
		// Obtain the GCF of the numerator and denominator:
		int gcf = NumberSystem.gcf(numerator, denominator);
		
		// Print the GCF of the numerator and the denominator:
		System.out.println("The greatest common factor of " 
							+ numerator + " and " + denominator + " is " + gcf + ".\n");
		
		// Print the reduced form of the fraction numerator/denominator:
		NumberSystem.reduceFraction(numerator, denominator);
	}

}
