//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String? Because it is mutable
		// 		a. Instantiate a new StringBuilder
		StringBuilder sb = new StringBuilder();
	
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		for (int i = 0; i <10; i++) {
			if (i < 9) {
				sb.append(i);
				sb.append("-");
			} else {
				sb.append(i);
			}
		} System.out.println(sb.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> players = new ArrayList<String>();
		players.add("Smith");
		players.add("Marchessault");
		players.add("McNabb");
		players.add("Karlsson");
		players.add("Roy");
		
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			System.out.println(findShortest(players));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			System.out.println(switchElements(players));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			System.out.println(concatList(players));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
			System.out.println(search(players, "ss"));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i <=100; i++) {
			numbers.add(i);
		}
		List<List<Integer>> sortedNumbers = (sortNumbers(numbers));
		for (List<Integer> list: sortedNumbers) {
			System.out.println(list);
		}
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(findLengths(players));

		
		// 9. Create a set of strings and add 5 values
		Set<String> pets = new HashSet<String>();
		pets.add("Riley");
		pets.add("Skylar");
		pets.add("George");
		pets.add("Moody");
		pets.add("Blueberry");
		
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.

		System.out.println(checkStart(pets, "g"));
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(changeToList(pets));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> nums = new HashSet<Integer>(numbers);
		System.out.println(findEven(nums));

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String,String> dictionary = new HashMap<String, String>();
		dictionary.put("struggle", "have difficulty handling");
		dictionary.put("easy", "achieved without great effort");
		dictionary.put("overcome", "succeed in dealing with");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(lookupValue(dictionary,"overcome"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(countFirstLetter(players));

	}
	
	
	// Method 15:
	public static Map<Character, Integer> countFirstLetter(List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for (String word:list) {
			char c = word.charAt(0);
			if(results.get(c)==null) {
				results.put(c, 1);
			}else {
				results.put(c, results.get(c)+1);
			}
		} return results;
	}
	
	
	// Method 14:
	
	public static String lookupValue(Map<String,String> map, String string) {
		for(String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}
	
	// Method 12:
	public static Set<Integer> findEven(Set<Integer> set){
		Set<Integer> onlyEvens = new HashSet<Integer>();
		for(Integer i :set) {
			if(i%2==0) {
				onlyEvens.add(i);
			}
		}return onlyEvens;
	}

	
	// Method 11:
	public static List<String> changeToList(Set<String> set) {
	List<String> list = new ArrayList<String>(set);
	return list;
	}


	// Method 10:
	public static Set<String> checkStart(Set<String> set, String c ){
		Set<String> result = new HashSet<String>();
		for (String string:set) {
			if(string.toLowerCase().startsWith(c)) {
				result.add(string);
			}
		}return result;
	}

	
	// Method 8:
	public static List<Integer> findLengths(List<String> strings){
		List<Integer> lengths = new ArrayList<Integer>();
		for(String string:strings) {
			lengths.add(string.length());
		} return lengths;
	}

	
	// Method 7:
	public static List<List<Integer>> sortNumbers(List<Integer> list){
		List<Integer> divBy2 = new ArrayList<Integer>();
		List<Integer> divBy3 = new ArrayList<Integer>();
		List<Integer> divBy5 = new ArrayList<Integer>();
		List<Integer> allRest = new ArrayList<Integer>();
		List<List<Integer>> bigList = new ArrayList<List<Integer>>();
		for (Integer i: list) {
			if (i%2==0) {
				divBy2.add(i);
			} if (i%3==0) {
				divBy3.add(i);
			} if (i%5==0) {
				divBy5.add(i);
			} else {
				allRest.add(i);
			}
		} 
		bigList.add(divBy2);
		bigList.add(divBy3);
		bigList.add(divBy5);
		bigList.add(allRest);
		return bigList;
	}

	
	// Method 6:
	public static List<String> search(List<String> list, String query){
		List<String> result = new ArrayList<String>();
		for (String string:list) {
			if (string.contains(query)) {
				result.add(string);
			}
		}return result;
	}

	
	// Method 5:
	public static String concatList(List<String> list) {
		StringBuilder strList = new StringBuilder();
		for (String string: list) {
			strList.append(string + ", ");			
		} return strList.toString();
	}
	
	
	// Method 4:
	public static List<String> switchElements(List<String> list){
		Collections.swap(list, 0, (list.size()-1));
		return list;
	} 
	
	
	// Method 3:
	public static String findShortest(List<String> list) {
		String shortest = list.get(0);
		for(String string:list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}return shortest;
	}
	

}