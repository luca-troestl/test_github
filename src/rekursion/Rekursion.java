package rekursion;

public class Rekursion {

	public static int fibonacciRecursive (int n) {
		if (n <= 1) {
		return n;
		}
		return fibonacciRecursive(n- 1) + fibonacciRecursive(n- 2);
		}
 
	public static int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		} else {
			int fib0 = 0;
			int fib1 = 1;
			for (int i = 2; i <= n; i++) {
				int temp = fib1;
				fib1 += fib0;
				fib0 = temp;
			}	
			return fib1;
		}
	}
 
	public static int fibonacciArray(int n) {
		if (n <= 1) {
			return n;
		} else {
			int[] fib = new int[n + 1];
			fib[0] = 0;
			fib[1] = 1;
			for (int i = 2; i <= n; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			return fib[n];
		}
	}
	public static void main(String[] args) {
		int n=6;
		System.out.println(fibonacciRecursive (n));
		System.out.println(fibonacciIterative(n));
		System.out.println(fibonacciArray(n));
	}
	
}
