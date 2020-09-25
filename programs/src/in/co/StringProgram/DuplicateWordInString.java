package in.co.StringProgram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {

		String s = "divya is a good girl and good Nature";

		Set<String> duplicates = duplicateWords(s);

		System.out.println(s);

		System.out.println(duplicates);
	}

	/**
	 * Method to find duplicate words in a Sentence or String * @param input
	 * String * @return set of duplicate words
	 */

	public static Set duplicateWords(String input) {

		if (input == null || input.isEmpty()) {
			return Collections.emptySet();
		}

		Set<String> duplicates = new HashSet<>();
		String[] words = input.split("\\s+");
		Set<String> set = new HashSet<>();

		for (String word : words) {
			if (!set.add(word)) {
				duplicates.add(word);
			}
		}
		return duplicates;

	}
}
