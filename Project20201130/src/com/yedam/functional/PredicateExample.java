package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<String> list = Arrays.asList("Hong", "Hwang", "Kim");

	public static void getName(Predicate<String> pred) {
		for (String name : list) {
			if (pred.test(name)) {
				System.out.println(name);
			}
		}

	}

	public static void main(String[] args) {
		getName(t -> t.length() > 3);

	}// end of main
}// end of class
