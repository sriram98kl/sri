package exercise;

import java.util.Arrays;


public class missingNumber {
	
	public static void main(String[] args) {
		
		int []arr= {8,2,3,7,5,4,1};
		int sum=0;
		
		
      	Arrays.sort(arr);
      	
    	System.out.println("the sorted array");
      	
      	for (int k = 0; k < arr.length; k++) {
      		
      	
      		
      		System.out.println(arr[k]);
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			 sum = sum+arr[i];
		
			}
		
		System.out.println(sum);
		
		int sum1=0;
		
		
		for (int j = 1; j <= 8; j++) {
		
		sum1=sum1+j;
		}
		
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
		
		
	}
	

}