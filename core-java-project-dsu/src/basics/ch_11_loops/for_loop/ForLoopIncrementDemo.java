package basics.ch_11_loops.for_loop;

public class ForLoopIncrementDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 5

		for (int counter = 1; counter < 6;) {
			System.out.print(counter + ", ");
			counter++;
		}

		System.out.println();

		for (int counter = 1; counter < 6; counter++) {
			System.out.println(counter);
		}
	}

}
