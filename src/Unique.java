
//Mike Knoles PA 3.9
//Unique.java
import java.util.Scanner;

public class Unique {
	// gets 5 unique numbers from the user
	public void getNumbers() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Create an array of five elements
		int numbers[] = new int[5]; // stores list of inputs from user in array

		int count = 0; // number of uniques read
		int entered = 0; // number of entered numbers

		while (entered < numbers.length) {
			System.out.print("Enter number: ");
			// code to to retrieve inputs
			int number = input.nextInt();

			// code to validate inputs using if statement
			// inputs five numbers, each of which is between 10 and 100, inclusive
			// write if statement that validates the input
			if (10 <= number && number <= 100) {
				// flags whether this number already exist
				boolean containsNumber = false;
				// increment number of entered numbers
				// entered++;
				// compare the user input to the unique numbers in the array using a
				// for statement. If number is unique , store new number
				for (int i = 0; i < count; i++)
					if (number == numbers[i]) {
						containsNumber = true;
					}

				// add the user input to the array only if the number is not already in the
				// array
				if (!containsNumber) {
					// write code to add the number to the array and increment unique items input
					numbers[count] = number;
					count++;
				} else
					System.out.printf("%d has already been entered\n", number);
			} else
				System.out.println("number must be between 10 and 100");

			// print the list of unique values
			// write code to output the contents of the array
			for (int i = 0; i < count; i++) {
				System.out.printf("%d ", numbers[i]);
			}
			System.out.println();
		} // end while
	} // end method getNumbers
} // end class Unique
