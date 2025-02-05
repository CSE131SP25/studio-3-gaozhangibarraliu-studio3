package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Give me a number a n...");
			int n = in.nextInt();
			boolean [] sieveArray = new boolean [n];
			for (int i = 0; i < n; i++ ) {
			sieveArray [i] = true;
			}
			for (int j=2; j < n; j++) {
				if (sieveArray[j-1] == true) {
					for (int i= (2*j-1); i < n; i += j) {
					sieveArray [i] = false;
					}
				
			}
		}
		System.out.println("Remaining prime numbers are : ");
		for (int j = 1; j < n; j++) {
			if (sieveArray[j] == true) {
				System.out.println(j+1);
			}
				
		}
	}

}
