package stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Uebungen {

	public static String reverseString(String input) {
		  LinkedList<Character> stack = new LinkedList<>();
		  for(char c : input.toCharArray()) {
			  stack.push(c);
		  }
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
			}
		return reversed.toString();
		}

	
	public static void main(String[] args) {
		
		String input = "Hello World";
		String output = reverseString(input);
		System.out.println(output);
	}

}
