import java.util.Scanner;

public class MakeChange {

	
	public static void main(String[] Args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a price");
		double price = kb.nextDouble();
		System.out.println("please enter a payment");
		double payment = kb.nextDouble();
		double change = payment - price;
		
		if (change == 0) {
			System.out.println("Thank You");
		} else {
			if ( change >= 0 ) {
				makeChange(change);
			} else {
				System.out.println("Thats not enough");
			}
		} 
	}

	private static void makeChange(double change) {

	
		double twenties = change%20;
		System.out.println(twenties + " " + change);
		
		
		
		
	}
	
	
	
	
}
