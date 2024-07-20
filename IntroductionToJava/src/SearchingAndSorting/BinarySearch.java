//Problem statement
//You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
//
//Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.
//
//Note:
//
//You must write an algorithm whose time complexity is O(LogN)
//
//Example:
//
//Input: ‘N’ = 7 ‘target’ = 3
//‘A’ = [1, 3, 7, 9, 11, 12, 45]
//
//Output: 1
//
//Explanation: A = [1, 3, 7, 9, 11, 12, 45],
//The index of element '3' is 1.
//Hence, the answer is '1'.

package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target) {

				return mid;
			} else if (target > nums[mid]) {

				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int x = s.nextInt();
		int result = BinarySearch.search(arr, x);
		System.out.print(result);
	}
}