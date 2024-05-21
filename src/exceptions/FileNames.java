package exceptions;

import java.io.EOFException;

public class FileNames {

	private static int CheckFileExtension ( String fileName) {
		try {
			if(fileName.endsWith(".java")) {
				return 1;
			} else { 
				return 0;
			}
		} catch (NullPointerException e) {
			return -1;
		} catch (EOFException e) {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		String f1 = "File.java";
		String f2 = "File.txt";
		String f3 = null;
		
		System.out.println(CheckFileExtension(f1));
		System.out.println(CheckFileExtension(f2));
		System.out.println(CheckFileExtension(f3));
		
	}

}
