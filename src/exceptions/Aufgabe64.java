package exceptions;

public class Aufgabe64 {

	
	public static int checkFileExtension(String fileName) throws EmptyException{
		try {
			if(fileName.endsWith(".java")) {
				return 1;
			} 
			if(fileName.isEmpty() || fileName == null) {
				throw new EmptyException();	
			}
			}catch(EmptyException e) {
			System.err.print("Die file ist leer ");
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) throws EmptyException{
		String fileName = "manu.java";
		String fileName2 = "manuelsen.docx";
		String fileName3 = "";
		System.out.println(checkFileExtension(fileName));
		System.out.println(checkFileExtension(fileName2));
		System.out.println(checkFileExtension(fileName3));
	}

}
