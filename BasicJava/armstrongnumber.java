package week1.day2;

public class armstrongnumber {
	public static void main(String[] args) {
		int input=153;
		int rem;
		int orgnNum=input;
		
		int sum=0;
		
		while(input>0) {
			 rem =input % 10;
			 
			rem=rem*rem*rem;
			
			sum= sum + rem ;
			input= input/10;
		
		
		}
		if(orgnNum==sum) {
			System.out.println(sum);
			System.out.println("given no.is  a armstrong no.");
		}
	
		else {
			System.out.println("given no.is not   a armstrong no.");

}
}
}	