package exceptions;

public class Aufgabe63 {
	
	public static double divide(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Zahl kann nicht durch 0 dividiert werden!");
		}
		try {
			return x/y;
		} catch(ArithmeticException e) {
			System.err.print(x + " kann nicht durch " + y + " dividiert werden!");
			return x/y;
		}
	}

	public static void main(String[] args) {
		System.out.println(divide(4,0));


		}
	}
