//You are given a rectangle in a plane whose sides are parallel to the axes. 
//The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.
//
//The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.

package GettingStartedWithJava;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		int a = (x2 - x1);
		int b = (y2 - y1);

		System.out.println(a * b);
	}

}