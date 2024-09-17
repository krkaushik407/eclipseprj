package basics.ch_09_arrays;

public class ArrayOfInteger {

	public static void main(String[] args) {
		int[] numberArray = { 1, 2, 3, 4, 5 };
		int rollNumberArray[] = { 100, 101, 102, 103 };
		int[] mobileNumberArray = new int[3];
		int pincodeArray[] = new int[5];
		int[] registerNumberArray = new int[] { 1001, 1002, 1003 };

		// getting the element values
		System.out.println(numberArray[4]); // 5

		// changing the element values
		numberArray[4] = 10;
		System.out.println(numberArray[4]); // 10

		// ArrayIndexOutOfBoundsException
		// The index is either negative 
		// or greater than or equal to the size of the array.
		System.out.println(numberArray[5]); // throw error / exception

	}

}
