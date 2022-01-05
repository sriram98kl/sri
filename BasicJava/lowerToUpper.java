package week3.day1;

public class lowerToUpper {

	public static void main(String[] args) {
		String a ="changeme";

		char   a1[]=a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			//char a1=a.charAt(i);
			

			if (i%2!=0)
			{
				a1[i]=(char)(a1[i]-32);

				//System.out.println(a1);

			}
			else {
			
				//System.out.println(a1);


			}

		}

System.out.println(a1);
	}}

