package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class sortingUsingCollection {
	public static void main(String[] args) {
		String[] str={"HCL","WIPRO","ASPIRE Systems","CTS"};
		
	int len=str.length;
	System.out.println(len);
	
	Set<String> a=new TreeSet<String>();
	
	for(String str1:str)
	{
		a.add(str1);
	}
	
	System.out.println(a);
	}

}
