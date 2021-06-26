import java.util.ArrayList;
import java.util.Scanner;



public class SumOfArray {

	public static void main(String[] args) {
		
		//Ask the user for 5 numbers and store them in an array list.
		//Then find the sum, product, largest, and smallest of those numbers.
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		
		//insert the number 
		for(int i=0; i< 5; i++) {
			System.out.print("Enter number " + (i+1) + ":");
			int number = input.nextInt();
			nums.add(number);
		}
		
		System.out.println("List of number in the arraylist: " + nums);
		
		//find sum of numbers in arrayList
		int findNumberSum = findSum(nums);
		System.out.println("The sum of numbers is :" + findNumberSum);
		int findProduct = findProduct(nums);
		System.out.println("The product is : " + findProduct);
		int largest = findLagest(nums);
		System.out.println("The largest number is: " + largest);
		int min = findMin(nums);
		System.out.println("The smallest number is: " + min);
		
		
	}
	
	public static int findSum(ArrayList<Integer> arr) {
		int sum = 0;
		for(int i=0; i < arr.size(); i++) {
			sum += (int) arr.get(i);
		}
		
		return sum;
	}
	
	public static int findProduct(ArrayList<Integer> arr) {
		int sum = findSum(arr);
		int product = 1;
		
		while (sum != 0) {
			product = product *(sum % 10);
			sum = sum/10;
		}
		
		return product;
	}
	
	public static int findLagest(ArrayList<Integer> arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.size(); i++) {
			if(arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		
		return max;
	}
	
	public static int findMin(ArrayList<Integer> arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i< arr.size(); i++) {
			if(arr.get(i) < min) {
				min = arr.get(i);
			}
		}
		
		return min;
	}


}
