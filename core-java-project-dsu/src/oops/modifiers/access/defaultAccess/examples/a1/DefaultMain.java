package oops.modifiers.access.defaultAccess.examples.a1;

public class DefaultMain {

	public static void main(String[] args) {
		Hotel paradise = new Hotel();
		paradise.name = "Hotel Paradise";
		paradise.rooms = 50;
		System.out.println(paradise.name);
		System.out.println(paradise.rooms);
	}

}
