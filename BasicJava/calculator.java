package week1.day2;

public class calculator {
	
	
	public int addition( int a , int b) {
		return a+b;
	}
	
	public double sub( double a , double b) {
		return a-b;
	}
	public double mul( double a , double b) {
		return a*b;
	}
	public int div( int a , int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		int value =	cal.addition(10, 2);
		System.out.println( value);
		
		double value1 =	cal.sub(10.2 , 2.3);
		System.out.println( value1);
		
		double value2 =	cal.mul(10.2, 2.3);
		System.out.println( value2);
		
		int value3 =	cal.div(10, 2);
		System.out.println( value3);
		
		
	}
}

