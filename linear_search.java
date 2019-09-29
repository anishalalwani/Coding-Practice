package basics;

/*
 * 1. Linear search: iterating through every element of the array
 * Algorithm: 
 * 1. loop to iterate through the length of array
 * 2. checking if it exist, if yes, return (i+1) else -1
 * 
 * Time complexity: 
 * Best: O(1): 1st element
 * Worst: O(n): 1. last element 2. when not found
 * 
 * Space complexity: O(1)
*/
import java.util.*;

public class linear_search {	
	public static int linear_search(int arr[], int value) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter numbers: ");	
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to be searched: ");
		int value = sc.nextInt();
		int result = linear_search(arr, value);
		if(result == -1) 
			System.out.print("Number not found!");
		else 
			System.out.print("Position at " + result);
	}
}
