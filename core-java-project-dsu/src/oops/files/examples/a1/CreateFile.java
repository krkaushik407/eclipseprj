package oops.files.examples.a1;

import java.io.File;

// file.exists()

public class CreateFile {

	public static void main(String[] args) {

		String filePath = "D:\\test\\java.txt";
		File file;

		try {
			file = new File(filePath);

			if (file.exists()) {
				System.out.println("FILE_ALREADY_EXISTS_AT: " + filePath);
			} else if (file.createNewFile()) {
				System.out.println("FILE_CREATED_AT: " + filePath);
			} else {
				System.out.println("FILE_NOT_CREATED_AT: " + filePath);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
