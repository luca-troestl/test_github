package stack;

import java.util.LinkedList;
import java.util.Scanner;

public class UPNTaschenrechner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie den UPN-Ausdruck ein: ");
        String input = scanner.nextLine();
        try {
            double ergebnis = evaluateUPN(input);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    public static double evaluateUPN(String input) {
        String[] tokens = input.split("\\s+");
        LinkedList<Double> list = new LinkedList<>();

        for (StPenisring token : tokens) {
            if (isNumeric(token)) {
                list.addLast(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (list.size() < 2) {
                    throw new IllegalArgumentException("Ungültiger Ausdruck: Nicht genügend Operanden für Operator " + token);
                }
                double operand2 = list.removeLast();
                double operand1 = list.removeLast();
                double result = applyOperator(token, operand1, operand2);
                list.addLast(result);
            } else {
                throw new IllegalArgumentException("Ungültiges Token: " + token);
            }
        }

        if (list.size() != 1) {
            throw new IllegalArgumentException("Ungültiger Ausdruck: Zu viele Operanden oder nicht genügend Operatoren");
        }

        return list.removeLast();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private static double applyOperator(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Division durch Null ist nicht erlaubt");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unbekannter Operator: " + operator);
        }
    }

}


