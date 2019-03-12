package com.soumyadeep.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceJava9 {

	/*
	 * To deal with this error, try-with-resource is improved in Java 9 and now we
	 * can use reference of the resource that is not declared locally.
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("soumyadeepJava9.txt");
		try (fileOutputStream) {

			String str = "try with resources in javatpoint";
			byte[] b = str.getBytes();
			fileOutputStream.write(b);
			System.out.println("file written java 9");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
