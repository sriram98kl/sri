package week3.day2;


import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class intersectionUsingCollection {

	public static void main(String[] args) {
	
		
		int [] arr1 = {3,2,11,1,6,8};
		int [] arr2= {1,2,8,4,9,7};
		
 Set<Integer>  a=   new TreeSet<Integer>();
	
 for (Integer a1:arr1)
 { a.add(a1);
 //System.out.println(a1);
 }
 for(Integer a2:arr2) {
 
	 if(a.add(a2)==false)
 System.out.println(a2);

	}

}}
