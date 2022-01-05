package exercise;

import java.util.Arrays;

public class intersection {
	public static void main(String[] args) {
		int [] arr1 = {3,2,11,1,6,8};
		int [] arr2= {1,2,8,4,9,7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=0;
		int j=0;
		
		while(i<arr1.length&&j<arr2.length) {
		
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
				i++;
				j++;
				
			
			}
			else if (arr1[i]>arr2[j])
			{	
				j++;
			}
			else 
			{
				i++;
		
		
				}
	}

}
}