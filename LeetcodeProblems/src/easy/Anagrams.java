package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

/*	
  Problem Statement
  Given an array of strings strs, group the anagrams together. You can return the answer in any order.
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
	typically using all the original letters exactly once.
*/
	public static List<List<String>> getAnagrams(String[] strs){
		HashMap<String, List<String>> anagramMap = new HashMap<>();
		String sortedWord;
		for(String word: strs) {
			word = word.toLowerCase();
			char[] charArray = word.toCharArray();
			 Arrays.sort(charArray);
			 sortedWord = new String(charArray);
			 List<String> anagrams = anagramMap.get(sortedWord);
			 if(anagrams == null || anagrams.isEmpty())
				 anagrams = new ArrayList<>();
			 anagrams.add(word);
			 
			 anagramMap.put(sortedWord, anagrams);
		}
		return new ArrayList<> (anagramMap.values());	
	}
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println("Anagrams --"+ getAnagrams(strs));
	}
	

}
