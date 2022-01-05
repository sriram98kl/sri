package week3.day1;

public class findTypes {
	public static void main(String[] args) {
		String a = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int letter=0;
		int digit=0;
		int spacebar=0;
		int special=0;
		
		char b[]=a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			
			if(Character.isLetter(b[i]))
			{
			
				letter++;
			}
			
			else if (Character.isDigit(b[i]))
			{
				digit++;
				
			}
			
			else if (Character.isSpaceChar(b[i]))
			{
				spacebar++;
				
			}
			else
			{
				special++;
				
			}
		

		
	}
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(spacebar);
		System.out.println(special);
		}

}
