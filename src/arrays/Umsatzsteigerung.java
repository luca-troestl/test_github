package arrays;

public class Umsatzsteigerung {

	
	static int [] dailyGains = {1000, 2000, 500, 9000, 9010};
	
	static int count5percent(int[] gains) {
		int i = 0;
		int anzahl = 0;
		if(!(gains[i]==0)) {
			for(int a=0; a<gains.length-1; a++) {
			if(gains[a]*1.05 <= gains[a+1]){
				anzahl++;
				i++;
			 }
			}
		}
		return anzahl;
	}
	
	
public static void main(String[] args) {
		
		System.out.println(count5percent(dailyGains));

	}

}
