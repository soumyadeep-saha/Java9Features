package com.soumyadeep.factoryMethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

	public static void main(String[] args) {

		/*
		 * Java 9 Collection library includes static factory methods for List, Set and
		 * Map interface. These methods are useful to create small number of collection.
		 */

		/*
		 * add method is called repeatedly for each list element, while in Java 9 we can
		 * do it in single line of code using factory methods
		 */

		/*
		 * Factory methods are special type of static methods that are used to create
		 * unmodifiable instances of collections. It means we can use these methods to
		 * create list, set and map of small number of elements.
		 * 
		 * It is unmodifiable, so adding new element will throw
		 * java.lang.UnsupportedOperationException
		 * 
		 * Each interface has it's own factory methods, we are listing all the methods
		 * in the following tables
		 */

		// Java 9 List Factory Method Example
		System.out.println("<<<<Factory list>>>>");
		List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : list) {
			System.out.println(l);
		}
		/*
		 * Java Set interface provides a Set.of() static factory method which is used to
		 * create immutable set. The set instance created by this method has the
		 * following characteristcis.
		 * 
		 * It is immutable No null elements It is serializable if all elements are
		 * serializable. No duplicate elements. The iteration order of set elements is
		 * unspecified and is subject to change.
		 */
		// Java 9 Set Interface Factory Methods Example
		System.out.println("<<<<Factory set>>>>");
		Set<String> set = Set.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : set) {
			System.out.println(l);
		}

		/*
		 * In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods
		 * that provide a convenient way to creae immutable maps.
		 * 
		 * Map created by these methods has the following characteristics.
		 * 
		 * It is immutable It does not allow null keys and values It is serializable if
		 * all keys and values are serializable It rejects duplicate keys at creation
		 * time The iteration order of mappings is unspecified and is subject to change.
		 */
		// Java 9 Map Interface Factory Methods
		System.out.println("<<<<Factory map>>>>");
		Map<Integer, String> map = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Java 9 Map Interface ofEntries() Method Example
		/*
		 * In Java 9, apart from static Map.of() methods, Map interface includes one
		 * more static method Map.ofEntries(). This method is used to create a map of
		 * Map.Entry instances
		 */

		// Creating Map Entry
		System.out.println("<<<<Factory map entry>>>>");
		Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
		Map<Integer, String> mf = Map.ofEntries(e1, e2);
		// Iterating Map
		for (Map.Entry<Integer, String> m : mf.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
