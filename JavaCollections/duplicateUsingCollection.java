package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class duplicateUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
	Set<Integer> num = new TreeSet<Integer>();
	
	for (Integer a1:a)
	{ 
		if (num.add(a1)==false)
		
			System.out.println("dupliate numbers "+a1); 

	}
	
	System.out.println(num);
	
}}



	
