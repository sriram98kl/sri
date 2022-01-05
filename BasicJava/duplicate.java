package exercise;

import java.util.Arrays;


public class duplicate {
	
	public static void main(String[] args) {
		
		int[]arr1 = {14,12,13,11,15,18,14,18,16,17,19,18,17,20};
		Arrays.sort(arr1);
		//Scanner scan = new Scanner(System.in);
				//System.out.println("enter the size of an array");
				//int size=scan.nextInt();
				//System.out.println("enter the element of an array");
				//int [] arr1 =new int[size];
				//for (int k = 0; k < arr1.length; k++) {	
		            // arr1[k]=scan.nextInt();
				//}
		
		
		for (int i = 0; i < arr1.length-1; i++) {
			int count=1;
		for (int j= i+1; j< arr1.length; j++) {
			
			// note: j=i+1 for finding duplicate
			
			if(arr1[i]==arr1[j]) {
				
				count++;
			}
			
			}
		
			if(count>1)
			{ 
				System.out.println(arr1[i]+"->"+count);		
		

		}	
		}
		


		}}
