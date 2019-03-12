package com.soumyadeep.streamApiImprovement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTakeWhile {

	public static void main(String[] args) {

		// Java Stream takeWhile() Method
		/*
		 * Stream takeWhile method takes each element that matches its predicate. It
		 * stops when it get unmatched element. It returns a subset of elements that
		 * contains all matched elements, other part of stream is discarded
		 */
		List<Integer> list = Stream.of(2, 2, 4, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);

		List<Integer> list1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list1);

		// Java Stream dropWhile() Method
		/*
		 * Stream dropWhile method returns result on the basis of order of stream
		 * elements.
		 * 
		 * Ordered stream: It returns a stream that contains elements after dropping the
		 * elements that match the given predicate.
		 * 
		 * Unordered stream: It returns a stream that contains remaining elements of
		 * this stream after dropping a subset of elements that match the given
		 * predicate
		 */
		List<Integer> list2 = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list2);

		// Java 9 Stream ofNullable Method Example 2
		Stream<Integer> val = Stream.ofNullable(null);
		val.forEach(System.out::println);

		// Java Stream Iterate Method
		/*
		 * A new overloaded method iterate is added to the Java 9 stream interface. This
		 * method allows us to iterate stream elements till the specified condition.
		 * 
		 * It takes three arguments, seed, hasNext and next
		 */
		Stream.iterate(1, i -> i <= 10, i -> i * 3).forEach(System.out::println);
	}
}
