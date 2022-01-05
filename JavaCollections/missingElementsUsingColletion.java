package week3.day2;



import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class missingElementsUsingColletion {

	public static void main(String[] args) {
		
		int []arr= {8,2,3,7,5,4,1};
		
		Arrays.sort(arr);
		
//		ArrayList   a= new ArrayList ();
	List<Integer> a= new ArrayList<Integer>();	
	
	for(Integer a1:arr)
		{
		a.add(a1);
		
	}
	System.out.println(a.get(a.size()-2));
	
	for (int i = 0; i <= arr.length; i++) {
		if (a.get(i)!=i+1)
		{
			System.out.println( i+1);
			break;
		
	}
		  
	
	
}
	}

}
