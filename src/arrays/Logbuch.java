package arrays;

import java.util.List;

public class Logbuch {

	
	public static void reduceToComment(List<String>lines) {
		for(int i=0; i<lines.size();i++) {
			if((i+1)%4==0) {
				lines.remove(i);
			}
		}
	}
	
	

	
	public static void main(String[] args) {
		
	
	}
}