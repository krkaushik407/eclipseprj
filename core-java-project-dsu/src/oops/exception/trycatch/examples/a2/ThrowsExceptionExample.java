package oops.exception.trycatch.examples.a2;

public class ThrowsExceptionExample {

	public static void main(String[] args) throws Exception {
		fun();

		System.out.println("Program is going to sleep now");
		Thread.sleep(10000);
		System.out.println("Program awake now");

	}

	public static void fun() {

		try {
			throw new ArithmeticException("some fun");
		} catch (Exception e) {
			System.out.println("We are having fun!");
			e.printStackTrace();
		}

	}

}
