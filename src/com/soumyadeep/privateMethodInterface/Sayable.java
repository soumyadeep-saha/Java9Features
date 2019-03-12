package com.soumyadeep.privateMethodInterface;

public interface Sayable {

	default void say() {
		sayPrivate(); // Calling private method
		sayPrivateStatic(); // Calling private static method
		sayDefault(); // Calling private static method
	}

	// Private method inside interface
	private void sayPrivate() {
		System.out.println("in interface in private method");
	}

	// Private static method inside interface
	private void sayPrivateStatic() {
		System.out.println("in interface in private static method");
	}

	default void sayDefault() {
		System.out.println("in interface in default method");
	}
}
