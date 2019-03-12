package com.soumyadeep.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceJava7 {

	/*
	 * Java introduced try-with-resource feature in Java 7 that helps to close
	 * resource automatically after being used.
	 * 
	 * In other words, we can say that we don't need to close resources (file,
	 * connection, network etc) explicitly, try-with-resource close that
	 * automatically by using AutoClosable interface.
	 */

	/*
	 * In Java 7, try-with-resources has a limitation that requires resource to
	 * declare locally within its block.
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileOutputStream fileOutputStream = new FileOutputStream("soumyadeepJava7.txt")) {

			String str = "try with resources in javatpoint";
			byte[] b = str.getBytes();
			fileOutputStream.write(b);
			System.out.println("file written java 7");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
