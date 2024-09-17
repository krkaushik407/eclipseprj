package oops.polymorphism.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Nuthan Gowda";

		Manager mgr = new Manager();
		mgr.name = "Adithya Rao";

		Clerk ck = new Clerk();
		ck.name = "Amar Dadge";

		printEmployee(emp);
		printEmployee(mgr);
		printEmployee(ck);

		printManager(mgr);
		// printManager(amar);
		// printManager(nuthan);

		printClerk(ck);
		// printClerk(adithya);
		// printClerk(nuthan);
	}

	public static void printEmployee(Employee emp) {
		System.out.println(emp.name);
	}

	public static void printManager(Manager mgr) {
		System.out.println(mgr.name);
	}

	public static void printClerk(Clerk ck) {
		System.out.println(ck.name);
	}

}
