package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Uebungen {

	public static String reverseString(String input) {
		  Stack<Character> stack = new Stack<>();

		  for (char c : input.toCharArray()) {
		    stack.push(c);
		  }

		  StringBuilder reversedString = new StringBuilder();
		  while (!stack.isEmpty()) {
		    reversedString.append(stack.pop());
		  }

		  return reversedString.toString();
		}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a text you want to reverse!");
		String inputText = sc.nextLine();
		System.out.println("Input text is: " + inputText);
		
		String reverseInput = reverseString(inputText);
		System.out.println("Reversed text is: " + reverseInput);
		  
	}

}
