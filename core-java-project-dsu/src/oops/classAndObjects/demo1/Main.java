package oops.classAndObjects.demo1;

public class Main {

	public static void main(String[] args) {

		// Datatype referenceVariable = new Datatype();
		// Class object = new Class();
		// object.fields;
		// object.methods();
		Student tanush = new Student();
		System.out.println(tanush);
		System.out.println(tanush.name); // null
		System.out.println(tanush.age); // 0

		tanush.name = "Tanush P.";
		tanush.age = 21;
		System.out.println(tanush.name);
		System.out.println(tanush.age);

	}

}
