package exercise;

import java.util.Scanner;

public class stringPalindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter your string");

		String str=sc.next();

		//String str= "madam";

		String rev="";

		int len= str.length();

		for (int i = len; i >0; i++) {

			rev=rev+str.charAt(i);	

		}

		if(str.equals(rev))
		{  System.out.println( "the string is palindrome"+str);

		}
		else {
			System.out.println( "the string is not a palindrome"+str);

		}

	}
}
