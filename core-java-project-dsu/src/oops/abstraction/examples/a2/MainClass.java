package oops.abstraction.examples.a2;

public class MainClass {

	// create class called Pen{}
	// create abstract method called ink() in it.
	// create class BlackPen{}
	// create class BluePen{}
	// implement ink method from Pen class in Black and Blue class
	// show the implementation with the help of 1 reference variables
	// of type Pen class

	public static void main(String[] args) {
		Pen pen;
		// pen = new Pen();

		pen = new BlackPen();
		pen.ink();

		pen = new BluePen();
		pen.ink();
	}

}
