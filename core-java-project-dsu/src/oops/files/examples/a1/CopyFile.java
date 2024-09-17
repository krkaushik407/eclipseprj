package oops.files.examples.a1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws Exception{

		
		String sourceFilePath = "E:\\test\\java.jpg";
		String targetFilePath = "E:\\test\\javanew.jpg";
		copyFile(sourceFilePath,targetFilePath);
		
	}


public static void copyFile(String sourceFilePath, String targetFilePath) throws Exception {
	FileInputStream fis = null;
	FileOutputStream fos = null;

	try {
		fis = new FileInputStream(sourceFilePath);
		
		fos = new FileOutputStream(targetFilePath);
		
		int data;
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		System.out.println("Read file from : "+ sourceFilePath);
		System.out.println("Write file from : "+ targetFilePath);
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		fis.close();
		fos.close();
	}
 }
}
