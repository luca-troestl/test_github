package exceptions;

public class TestCorrection {
	
	public static double divide(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Division durch Null ist nicht erlaubt");
			}
		
		try {
			double erg = x/y;
			System.out.println("Das Ergebnis lautet: " + erg);
			return erg;
		} catch (ArithmeticException e) {
			return x/y;
			}
		}
	
	public static void main(String[] args) {
		divide(9, 0);
	}
	
}
