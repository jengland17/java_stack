package phones;

public class PhoneTester {
	
	public static void main(String[] args) {
		
		Galaxy S20 = new Galaxy("S20 Ultra", 100, "T-Mobile", "Ring Ring!");
		IPhone X= new IPhone("X", 85, "Verizon", "Buzz Buzz..."); 
		
		S20.displayInfo();
		System.out.println(S20.unlock());
		System.out.println("Galaxy says " + S20.ring());
		
		System.out.println("===================================");
		
		X.displayInfo();
		System.out.println(X.unlock());
		System.out.println("iPhone says " + X.ring());
		
	}

}
