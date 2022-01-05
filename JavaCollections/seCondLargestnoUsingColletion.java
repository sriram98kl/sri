package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seCondLargestnoUsingColletion {
	
	public static void main(String[] args) {
int []arr= {3,2,11,4,6,7};
		
		Arrays.sort(arr);
		

	List<Integer> a= new ArrayList<Integer>();	
	
	for(Integer a1:arr)
		{
		a.add(a1);
		
	}
	System.out.println(a.get(a.size()-2));
	}

}
