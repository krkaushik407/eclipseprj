package oops.constructor.examples.a2;

// create class employee
// 2 instance variable
// string name
// string city
// all the possible constructors
// create objects using all the constructors in main class
// execute and show the output

public class Main {

	public static void main(String[] args) {
		Employee kaushik = new Employee();
		System.out.println(kaushik.name);
		System.out.println(kaushik.city);

		Employee dinesh = new Employee("Bangalore");
		System.out.println(dinesh.name);
		System.out.println(dinesh.city);

		Employee srinivas = new Employee("Srinivas Chowdappa", "Bangalore");
		System.out.println(srinivas.name);
		System.out.println(srinivas.city);
	}

}
