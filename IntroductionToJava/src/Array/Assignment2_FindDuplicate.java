//Problem statement
//You have been given an integer array/list(ARR) of size N 
//which contains numbers from 0 to (N - 2). Each number is present at least once. 
//That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, 
//there is a single integer value that is present twice. 
//You need to find and return that duplicate number present in the array.
//
//Note :
//Duplicate number is always present in the given array/list.

package Array;

import java.util.Scanner;

public class Assignment2_FindDuplicate {

	public static int duplicateNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					return arr[j];
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		while (t > 0) {
			int n = sr.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sr.nextInt();
			}
			System.out.println(Assignment2_FindDuplicate.duplicateNumber(arr));

			t -= 1;
		}
	}
}
