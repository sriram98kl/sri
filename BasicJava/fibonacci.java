package wee1.day1;


public class fibonacci {
	
	
public static void main(String[] args) {
int range = 8 ; 
int firstNum=0; 
int secondNum=1;

System.out.println("fibonacci series of range 8");

	System.out.println(firstNum); 
	
	System.out.println(secondNum);
	for (int i = 0; i <6; i++) {
		
	int	add=firstNum+secondNum;
		
		firstNum=secondNum;
		
		 secondNum=add;
		 
			 
			
		System.out.println(add);
	}
	


}

}