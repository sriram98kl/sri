package wee1.day1;

public class mobile {
	
	String mobileColor="blue";
	int weight=4;
	double mobileCost=363636.353535;
	
	
	
	public void makeCalls() {
		System.out.println("calling");
	}
	public void sendMsg() {
		System.out.println("message sent");
	}
	public static void main(String[] args) {
		mobile myMobile = new mobile(); 
		
		myMobile.makeCalls();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileColor);
		System.out.println(myMobile.weight);
		System.out.println(myMobile.mobileCost);
		
		
		
	}
}
