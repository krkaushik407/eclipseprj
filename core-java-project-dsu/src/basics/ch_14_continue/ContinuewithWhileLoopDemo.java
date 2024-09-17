package basics.ch_14_continue;

public class ContinuewithWhileLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 3 except 2
		int counter = 1;
		while (counter < 4) {
			
			if(counter == 2) {
				counter++;
				// System.out.println(counter);
				continue;
			}
			
			System.out.println(counter);
			counter++;
		}

	}

}
