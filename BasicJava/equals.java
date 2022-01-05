package week3.day1;

public class equals {

	public static void main(String[] args) {
		
    String text = "Java exercise";
    String text1 = "java exercise";
    String text2= "Iam working with java 8";
    
  System.out.println(text.substring(4, 12)); 
    
    if(text1==text)
    {
    	System.out.println("same text");
    }
    else
    {
    	System.out.println("different text");
    }
    if(text1.equals(text))
    {
    	System.out.println("same text");
    }
    else
    {
    	System.out.println("different text");
    }
    if(text1.equalsIgnoreCase(text))
    {
    	System.out.println("same text");
    }
    else
    {
    	System.out.println("different text");
    }
    
 System.out.println( text2.replace("8","11"));
 
 System.out.println(text2.substring(5,15));
  
	}

}
