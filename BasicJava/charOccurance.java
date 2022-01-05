package exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class charOccurance {
	public static void main(String[] args) {

		//Scanner sc=new Scanner(System.in);

		//System.out.println("enter your string");

		//String str=sc.next();

		String str ="welcome to chennai";
		int len=str.length();

		//str=str.replace(" ","");
		char[] arr=str.toCharArray();
		//for(char arr : charArray)
		{System.out.println(arr);
		}

		int	count=0;
		Map <Character,Integer>map=new TreeMap<>();

		for (int i = 0; i < len; i++) {
			count=0;
			for (int j = 0; j <len; j++) {


				if(arr[i]==arr[j])
				{
					//System.out.println("\n"+arr[i]);

					count++;
				}

			}
			if(count>1) {
						
				map.put(arr[i], count);
			}
		}System.out.println(map);

	}}
