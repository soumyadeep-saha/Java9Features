package com.soumyadeep.safeVarargs;

public class VarargsJdk5 {

	/*
	 * In JDK 5, Java has included a feature that simplifies the creation of methods
	 * that need to take a variable number of arguments. This feature is called
	 * varargs and it is short-form for variable-length arguments. A method that
	 * takes a variable number of arguments is a varargs method.
	 */

	/*
	 * Prior to JDK 5, variable-length arguments could be handled two ways. One
	 * using overloaded method(one for each) and another put the arguments into an
	 * array, and then pass this array to the method. Both of them are potentially
	 * error-prone and require more code. The varargs feature offers a simpler,
	 * better option.
	 */

	/*
	 * A variable-length argument is specified by three periods(…). For Example,
	 * public static void fun(int ... a) { // method body }
	 */

	/*
	 * It can be called with zero or more arguments. As a result, here a is
	 * implicitly declared as an array of type int[]
	 */
	public static void varArgSameType(int... a) {

		/*
		 * The … syntax tells the compiler that varargs has been used and these
		 * arguments should be stored in the array referred to by a.
		 */
		System.out.println("Start of varArgSameType");
		System.out.println(a.length);

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("End of varArgSameType");
	}

	/*
	 * A method can have variable length parameters with other parameters too, but
	 * one should ensure that there exists only one varargs parameter that should be
	 * written last in the parameter list of the method declaration.
	 * 
	 * int nums(int a, float b, double … c)
	 */

	/*
	 * In this case, the first two arguments are matched with the first two
	 * parameters and the remaining arguments belong to c
	 */
	public static void varArgDiferrentType(String str, int... a) {

		/*
		 * The … syntax tells the compiler that varargs has been used and these
		 * arguments should be stored in the array referred to by a.
		 */
		System.out.println("String is: " + str);
		System.out.println("Start of varArgDiferrentType");
		System.out.println(a.length);

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("End of varArgDiferrentType");
	}

	public static void main(String[] args) {

		varArgSameType();
		varArgSameType(1);
		varArgSameType(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		varArgDiferrentType("soumyadeep");
		varArgDiferrentType("soumyadeep", 1);
		varArgDiferrentType("soumyadeep", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	}

	/*
	 * Erroneous varargs Examples
	 * 
	 * Specifying two varargs in a single method: void method(String... gfg, int...
	 * q) { // Compile time error as there are two // varargs } Specifying varargs
	 * as the first parameter of method instead of last one: void method(int... gfg,
	 * String q) { // Compile time error as vararg appear // before normal argument
	 * }
	 */
}
