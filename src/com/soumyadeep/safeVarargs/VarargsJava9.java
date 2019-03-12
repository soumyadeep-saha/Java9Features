package com.soumyadeep.safeVarargs;

import java.util.ArrayList;
import java.util.List;

public class VarargsJava9 {

	/*
	 * It is an annotation which applies on a method or constructor that takes
	 * varargs parameters. It is used to ensure that the method does not perform
	 * unsafe operations on its varargs parameters.
	 * 
	 * It was included in Java7 and can only be applied on
	 * 
	 * Final methods Static methods Constructors From Java 9, it can also be used
	 * with private instance methods.
	 */

	/*
	 * The @SafeVarargs annotation can be applied only to methods that cannot be
	 * overridden. Applying to the other methods will throw a compile time error.
	 */

	private void display(List<String>... products) { // Not using @SaveVarargs
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	// Applying @SaveVarargs annotation
	@SafeVarargs
	private void displayVararg(List<String>... products) {
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	/*
	 * What happens? If we compile the following code by using older versions of
	 * Java. afeVar.java:6: error: Invalid SafeVarargs annotation. Instance method
	 * display(List<String>...) is not final
	 */
	public static void main(String[] args) {

		VarargsJava9 p = new VarargsJava9();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		p.display(list);

		VarargsJava9 p1 = new VarargsJava9();
		List<String> list1 = new ArrayList<String>();
		list1.add("Laptop1");
		list1.add("Tablet1");
		p1.displayVararg(list1);
	}
}
