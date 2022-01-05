package exercise;

import java.util.Scanner;

public class postiveNegative

{


	public static void main(String[] args) {
		
		System.out.println("enter the number");

	Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	
	//int a=-2;
	
	if(a<0) {
	     
		System.out.println(a +"   " +"number is negative");
		 a=a*-1;
		 
		System.out.println("after conversion"+ "  "+ a);
	}
	else if(a>0)
	{System.out.println(a +"number is positive");
	}
	else 
	{ System.out.println("number is neither negative nor positive");
	
 
	
	}}}

	
