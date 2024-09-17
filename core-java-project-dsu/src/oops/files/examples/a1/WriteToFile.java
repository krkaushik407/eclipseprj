package oops.files.examples.a1;

import java.io.File;
import java.io.FileWriter;

// We can use FileWriter class to create a object of FileWriter class
// and use write() method
public class WriteToFile {

	public static void main(String[] args) throws Exception {
		String text = """
				Hello World
				Sun Shine
				""";
		System.out.println(text);
		String filePath = "D:\\test\\java.txt";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.write(text);
			System.out.println("WROTE_TO_FILE_AT: " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}

	}

}
