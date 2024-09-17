package oops.abstraction.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Zomato zomato;

		// zomato = new Zomato(); not allowed to initialize using Abstract Class

		zomato = new GooglePay();
		zomato.payment();
		zomato.display();

		zomato = new PhonePe();
		zomato.payment();
		zomato.display();

	}

}
