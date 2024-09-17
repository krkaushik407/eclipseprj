package oops.polymorphism.runtime.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		Pen pen;
		
		pen = new Pen() {

			public void ink() {
				System.out.println("Ink is black");
			}

		};
		pen.ink();

		pen = new Pen() {

			public void ink() {
				System.out.println("Ink is blue");
			}

		};
		pen.ink();

	}

}
