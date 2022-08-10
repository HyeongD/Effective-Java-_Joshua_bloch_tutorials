package Item5;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
	private final Lexicon dictionary;
	
	public SpellChecker(Lexicon dictionary) {
		this.dictionary = dictionary;
	}
	
	public boolean isValid(String word) {
		return false;
	}
	
	public List<String> suggestions(String typo){
		List<String> list = new ArrayList<>();
		return list;
	}
}
