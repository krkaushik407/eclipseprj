package basics.ch_11_loops.while_loop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 5

		int counter = 1;

		while (counter < 6) {
			System.out.print(counter + ", "); // 1 2 3 4 5
			// counter = counter + 1;
			counter++; // 2 3 4 5 6
		}
	}
}
