//Problem statement
//Print the following pattern for the given N number of rows.
//
//Pattern for N = 4
//*
//**
//***
//****
//Note : There are no spaces between the stars (*).

package Pattern1;

import java.util.Scanner;

public class TriangleStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;

			}
			System.out.println();
			i++;
		}
	}

}
