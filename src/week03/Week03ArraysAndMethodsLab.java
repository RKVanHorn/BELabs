//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arr = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println(arr[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println(arr[arr.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?
		// System.out.println(arr[6]);
		// out of bounds error

		// 5. Print out the element in the array at position -1, what happens?
		// System.out.println(arr[-1]);
		// another out of bounds error
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array
		for (int a : arr) {
			System.out.println(a);
		}

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		int avg = sum / arr.length;
		System.out.println(avg);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		for (int a : arr) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };

		// 12. Calculate the sum of all the letters in the new array
		int letterSum = 0;
		for (String name : names) {
			letterSum += name.length();
		}
		System.out.println(letterSum);

		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		greeting("Rachel");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println(greetName("Rachel"));

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods. 14 has a return
		// statement
		// b. What do you find? 13 prints to the console, but I had to sysout 14,
		// because it creates
		// a return statement, but we dont tell it to do anything with that statement
		// c. How are they different?

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println(isBigger("banana", 9));
		System.out.println(isBigger("pineapple", 4));

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		String[] colors = { "red", "orange", "purple", "blue", "black", "green" };
		String fav = "purple";
		System.out.println(findWord(colors, fav));

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		int[] numbers = { 29, 101, 500, 32, 5, -9 };
		System.out.println(findSmallest(numbers));

		// 18. Write and test a method that takes an array of double and
		// returns the average
		double[] doubles = { 31.3, 14.5, 66.0, 102.8, 15.9, 0 };
		System.out.println(findAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		String[] family = { "Jeremy", "Rachel", "Quinn", "Toby", "Simon" };
		System.out.println(getLengths(family));

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		System.out.println(compareLengths(family));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome
		System.out.println(checkPalindrome("banana"));
		System.out.println(checkPalindrome("tacocat"));
		System.out.println(checkPalindrome("Mom"));
	}

	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greetName(String name) {
		return ("Hi, " + name + "!");
	}

	// Method 15:
	public static boolean isBigger(String word, int num) {
		if (num > word.length()) {
			return true;
		} else {
			return false;
		}
	}

	// Method 16:
	public static boolean findWord(String[] arr, String word) {
		if (Arrays.asList(arr).contains(word)) {
			return true;
		} else {
			return false;
		}
	}

	// Method 17:
	public static int findSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	// Method 18:
	public static double findAverage(double[] arr) {
		double sum = 0.00;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	// Method 19:
	public static int[] getLengths(String[] arr) {
		int[] nums = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nums[i] = arr[i].length();
		}
		return nums;
	}

	// Method 20:
	public static boolean compareLengths(String[] arr) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				sumEven += arr[i].length();
			} else {
				sumOdd += arr[i].length();
			}
		}
		if (sumEven > sumOdd) {
			System.out.println(sumEven + " is more than " + sumOdd);
			return true;

		} else {
			System.out.println(sumOdd + " is more than " + sumEven);
			return false;
		}
	}

	// Method 21:
	public static boolean checkPalindrome (String word) {
		String reverse = "";
		word = word.toLowerCase();
		for (int i = word.length()-1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		System.out.println(reverse);
		if(word.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}
}