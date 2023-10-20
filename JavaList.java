package Sample;

import java.util.ArrayList;
import java.util.List;


public class JavaList {
	public static void main(String[] args) {
		String value = "Java Programming is a Popular Language!!";
		List<String> couleurs = new ArrayList<String>();
	
		couleurs.add("Vert");
		couleurs.add("Bleu");
		couleurs.add("Orange");
		
		for(String i : couleurs){
			System.out.print(i + "\n");
		}
	
		System.out.println(value.toLowerCase());
		System.out.println(value.toUpperCase());

	}
}
