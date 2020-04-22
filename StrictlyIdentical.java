package project4;

/* Sample Run:
 * Enter 1th number of first array: 1
Enter 2th number of first array: 2
Enter 3th number of first array: 3
Enter 4th number of first array: 4
Enter 5th number of first array: 5
Enter 1th number of second array: 1
Enter 2th number of second array: 2
Enter 3th number of second array: 3
Enter 4th number of second array: 4
Enter 5th number of second array: 5
Two lists are strictly identical.
 */

import java.util.Scanner;

public class StrictlyIdentical {
	public static void main(String[] args) {
		//Use scanner object to prompt entry of arrays. State that i+1 gets the next number in the list but must be less than 5.

		Scanner input = new Scanner(System.in);

		int[] array1 = new int[5];

		int[] array2 = new int[5];

		for(int i = 0; i<5; i++) {

		System.out.print("Enter " + (i+1) + "th number of first array: ");

		array1[i] = input.nextInt();

		}

		for(int i = 0; i<5; i++) {

		System.out.print("Enter " + (i+1) + "th number of second array: ");

		array2[i] = input.nextInt();

		}

		if(equals(array1, array2)){

		System.out.println("Two lists are strictly identical.");

		} else {

		System.out.println("Two lists are not strictly identical.");

		}

		}

		public static boolean equals(int[] array1, int[] array2) {

		// The arrays must not be null and must have equal length

		if(array1 == null || array2 == null || array1.length != array2.length) return false;

		boolean allEqual = true;

		for(int i = 0; i<array1.length; i++) {

		if(array1[i] != array2[i]) {

		allEqual = false;

		break;

		}

		}

		return allEqual;

		}

		}
