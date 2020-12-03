package com.yedam.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {

		// java library 내에 있는 functional interface of Consumer Interface 사용연습
		Consumer<String> consumer = null;
		consumer = (t) -> System.out.println("Hello " + t);
		consumer.accept("Hong");
		consumer.accept("Hwang");

		BiConsumer<String, Integer> biCon = null;
		biCon = (t, u) -> System.out.println("이름은 " + t + ", 나이는 " + u);
		biCon.accept("Song", 10);

		ObjIntConsumer<String> objIntCon = null;
		objIntCon = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println("이름은: " + t + ", 점수는 " + value);
			}
		}; objIntCon.accept("Hwang", 88);
		
		
	}
}
