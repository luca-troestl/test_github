package stack;
 
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class PasswordTester {
 
	//Aufgabe 1
	static int anzahlZeichen(String wort) {
		int i=0;
		for(char c : wort.toCharArray()) {
			i++;
		} return i;
	}
	public static boolean testPassword(String password) {
		boolean sindZahlen = false;
		boolean sindSonderzeichen = false;
		boolean sindKleinbuchstaben = false;
		boolean sindGroﬂbuchstaben = false;
		boolean genugZeichen = false;
		Pattern alleSonderzeichen = Pattern.compile("[+\\-*/!ß$%&?=]");
		Pattern zahlen = Pattern.compile("[0-9]");
		Pattern kleinbuchstaben = Pattern.compile("[a-z]");
		Pattern groﬂbuchstaben = Pattern.compile("[A-Z]");
		for(String token : password.split("")) {
			Matcher sonderzeichenMatch = alleSonderzeichen.matcher(token);
			Matcher zahlenMatch = zahlen.matcher(token);
			Matcher kleinbuchstabenMatch = kleinbuchstaben.matcher(token);
			Matcher groﬂbuchstabenMatch = groﬂbuchstaben.matcher(token);
			if(sonderzeichenMatch.matches()) {
				sindSonderzeichen = true;
			}
			if(zahlenMatch.matches()) {
				sindZahlen = true;
			}
			if(kleinbuchstabenMatch.matches()) {
				sindKleinbuchstaben = true;
			}
			if(groﬂbuchstabenMatch.matches()) {
				sindGroﬂbuchstaben = true;
			}
		}
		if(anzahlZeichen(password)>=8) {
			genugZeichen = true;
		} else { System.out.println("Nicht genug Sonderzeichen"); }
		if(sindZahlen && sindSonderzeichen && sindKleinbuchstaben && sindGroﬂbuchstaben && genugZeichen) {
			return true;
		}
		if(!sindSonderzeichen) {
			System.out.println("Keine Sonderzeichen vorhanden");
		}
		if(!sindZahlen) {
			System.out.println("Keine Zahlen vorhanden");
		}
		if(!sindKleinbuchstaben) {
			System.out.println("Keine Kleinbuchstaben vorhanden");
		}
		if(!sindGroﬂbuchstaben) {
			System.out.println("Keine Groﬂbuchstaben vorhanden");
		}
		return false;
	}

	public static void main(String[] args) {
		String password = "Manuel+isch+komisch+lg1234";
		System.out.println(testPassword(password));
	}
 
}
