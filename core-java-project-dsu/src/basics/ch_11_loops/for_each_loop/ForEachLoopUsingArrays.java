package basics.ch_11_loops.for_each_loop;

public class ForEachLoopUsingArrays {

	public static void main(String[] args) {
		String[] subjectArray = { "java", "sql", "python", "machine learning", "ai" };

		for (String subject : subjectArray) {
			System.out.print(subject + ", ");
		}

		System.out.println();

		int[] numberArray = { 1, 2, 3, 4, 5 };
		for (int number : numberArray) {
			System.out.print(number + ", ");
		}

	}

}
