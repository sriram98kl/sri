package week3.day1;

import java.util.Arrays;

public class anagram {
	
	public static void main(String[] args) {
		
		String text1="stops";
		
		String text2="potss";
		
	System.out.println(text1.length());	
	System.out.println(text2.length());	
	
	if(text1.length()==text2.length())
	{
		char[] arr1=text1.toCharArray();
		char[] arr2=text1.toCharArray();
		
	    Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		//for (int i = 0; i < arr2.length; i++) {
		
	boolean result =Arrays.equals(arr1, arr2);
		if (result==true)	
		{
			System.out.println("both are same");
		}
		
		else
		{
			System.out.println("diff arrays");
		}
	}
	
		//Arrays.sort(text1);
		
	}

	}
