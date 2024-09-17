package basics.ch_07_operators.ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// Ternary Operator -- ?
		
		System.out.println(true ? "java" : "python"); // java
		System.out.println(false ? "java" : "python"); // python
		
		System.out.println(true ? 5 : 10); // 5
		System.out.println(false ? 5 : 10); // 10
		
		String subject;
		subject = true ? "sql" : "machine learning";
		System.out.println(subject); // sql
		
		subject = false ? "sql" : "machine learning";
		System.out.println(subject);
		
		char character;
		
		byte byteNumber;
		
		short shortNumber;
		
		int intNumber;
		
		long longNumber;
		
		float floatNumber;
		
		double doubleNumber;
		
		boolean isTrueOrFalse;
		isTrueOrFalse = true ? false : true;
		System.out.println(isTrueOrFalse); // false
		
		isTrueOrFalse = false ? false : true;
		System.out.println(isTrueOrFalse); // true
		
		
		
		
		
		

	}

}
