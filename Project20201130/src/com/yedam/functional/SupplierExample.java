package com.yedam.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample { // 매개값 없고 반환값이 있음
	public static void main(String[] args) {
		Supplier<String> sup = null;
		sup = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		};
		System.out.println(sup.get());
		Supplier<Integer> intSup = null;
		intSup = new Supplier<Integer>() {

			@Override
			public Integer get() {
				int result = 35 * 20;
				return result;
			}
		};
		System.out.println(intSup.get());

		IntSupplier intSupp =() -> (int) (Math.random() * 6) + 1;
			
		System.out.println(intSupp.getAsInt());
		
	}
}
