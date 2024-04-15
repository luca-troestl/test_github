package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class KorrekteKlammerung {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib deinen Satz ein: ");
        String input = scanner.nextLine();
        if (checkBrackets(input)) {
            System.out.println("Korrekte Klammerung!");
        } else {
            System.out.println("Fehlerhafte Klammerung!");
        }
    }

    public static boolean checkBrackets(String expression) {
        LinkedList<Character> list = new LinkedList<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                list.addLast(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (list.isEmpty()) {
                    return false;
                }
                char top = list.removeLast();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }

}

