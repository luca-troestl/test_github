package käseklasse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	// private = Sichtbarkeit auf die eigene Klasse beschränkt
	// static = unabhängig von einem Objekt, gehört zur Klasse
	// final = Wert der Variable bleibt nach Initialisierung unverändert
	private static final Pattern vegetables = Pattern.compile(
				"Zucchini|Paprikas?|Tomaten?|Zwiebeln?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			// Auslesen der momenatanen Zutat
				String ingredient = iterator.next();
				// Überprüfen, ob die Zutat zu unserem Vegetable passt
				if(vegetables.matcher(ingredient).matches()) {
					iterator.add("Käse");
				}
				}
	}
			

	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln", "Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
	}

}
