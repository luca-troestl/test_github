package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class KorrekteKlammerung {

	public static boolean checkBrackets(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		for(char c : input.toCharArray()) {
			if( c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if ( c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
			char lastOpen = stack.peek();
			if((c == ')' && lastOpen != '(') ||
				(c == '}' && lastOpen != '{') ||
				(c == ']' && lastOpen != '[')) {
				return false;
			 }
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String str = "()()";
		System.out.println(checkBrackets(str));
	}
}

