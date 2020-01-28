package br.com.cicero.reversestring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	
	
	/**
	 * Method to reverse a string using StringBuilder
	 * @param str
	 * @return a string reversed
	 */
	public String reverseStringStringBuilder(String str) {
		
		 if(str == null || str.trim().length() < 2 ) {
			 return "Error";
		 }else {
			 StringBuilder strToReverse = new StringBuilder(str);
			 return strToReverse.reverse().toString();
		 }
	}
	
	/**
	 * Method to reverse a string using a looping O(n)
	 * @param str
	 * @return a string reversed
	 */
	public String  reverseStringLooping(String str) {
		
		 if(str == null || str.trim().length()  < 2) {
			 return "Error";
		 }
		 
		 List<Character> lista = new ArrayList<>();
		 
		 IntStream.range(0,str.length()).forEach(i -> lista.add(str.charAt((str.length()-1) -i)));
		 
		 return lista.stream().map(Object::toString).collect(Collectors.joining(""));
	}
}
