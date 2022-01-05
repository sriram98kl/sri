package exercise;



public class reverseEvenWord {
	
	public static void main(String[] args) {
		

	String str = "I am a software tester";
	String [] arr= str.split(" ");
	
	String revString="";
	
	for (int i = 0; i < arr.length; i++) {
		String word = arr[i];
		String revWord="";
		String origword1="";
		
		
		
		if( i%2!=0) {
		
		for (int j =word.length()-1; j>=0 ; j--) {
			revWord=revWord+word.charAt(j);
			//System.out.println(	revWord);
		}
		
		revString=revString+revWord+" ";
	
	}
		else
		{
			origword1=origword1+word+"";
			
		}
	
		 System.out.println(origword1);
		 
	}
	 
	System.out.println(revString);

	}
		


}