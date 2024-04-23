package rekursion;

public class Faculty {

	
	public static int calculateFaculty(int n){
		if(n==0) {
			return 1;
		} else {
			return n * calculateFaculty(n-1);
		}
	}
	
	public static int calculateBinomialkoeffizient(int n, int k) {
		if()
	}
	
	public static int pow(int b, int e) {
		if(e==0) {
			return 1;
		} else {
			return b*pow(b,e);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateFaculty(4));
		System.out.println(pow(2,3));
	}

}
