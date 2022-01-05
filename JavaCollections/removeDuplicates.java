package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
	public static void main(String[] args) {
		String  a = "paypal India";
		
		char[] a1=a.toCharArray();
		
		Set<Character> charSet =new LinkedHashSet<Character>();
		
	for(char ch:a1) {
		charSet.add(ch);
		
	}
	
	String string = charSet.toString();
	
	System.out.println( string.replace("," , ""));
	}

}
