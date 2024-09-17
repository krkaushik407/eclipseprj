package oops.files.examples.a1;

import java.io.FileOutputStream;

// FileOutputStream

public class WriteToFileUsingFileOutputStream {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\test\\java.txt";
		String text = "You are the light of his life.";

		writeToFile(filePath, text);
	}

	public static void writeToFile(String filePath, String text) throws Exception {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(filePath);

			byte[] textArray = text.getBytes();
			fos.write(textArray);
			System.out.println("WROTE_TO_FILE_AT: " + filePath);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}
	}

}
