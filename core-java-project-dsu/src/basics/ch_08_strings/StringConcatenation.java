package basics.ch_08_strings;

public class StringConcatenation {

	public static void main(String[] args) {
		// joining or combining characters or string is
		// referred as Concatenation

		// joining String + String => String
		System.out.println("sun" + "shine"); // sunshine

		// Joining String + int => String
		System.out.println("java" + 10); // java10

		// 14 => "14"
		String numberText = 14 + "";
		System.out.println(numberText); // "14"

		String subject = "java";
		String text = subject + " " + 10;
		System.out.println(text); // java 10

		// concat()
		System.out.println("java".concat("programming")); // javaprogramming
		System.out.println(subject.concat("programming")); // javaprogramming
		System.out.println("java".concat(" programming")); // java programming
		System.out.println("java".concat(" " + "programming")); // java programming
		
		text = "programming";
		String course = subject + " : " + text;
		System.out.println(course); // java : programming
		System.out.println(subject.concat(" " + text)); // java programming

	}

}
