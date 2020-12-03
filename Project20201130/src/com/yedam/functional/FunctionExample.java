package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {

	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) { // 학생List를 받아와서 String 타입으로 반환해주는 Function인터페이스를 구현
																		// 하는 메서드
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	// Function<Student, Integer> func
	public static void printInt(ToIntFunction<Student> func) { // <>내의 매개값을 int타입으로 받겠다..
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}
	
	public static double avg(ToDoubleFunction<Student> func) {
		double result =0;
		double sum = 0;
		
		for(Student student :list) {
			result = func.applyAsDouble(student);
			sum += result;
			
		}
		return sum/list.size();
	}

	
	
	public static void main(String[] args) {
//		Function<String, Integer> func = null;
//		func = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String t) {
//				return t.length();
//			}
//		};
//		System.out.println(func.apply("Hello World"));
		
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>(){

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore()	;
			}
		});
		System.out.println("result: " + avg);

		BiFunction<String, String, Integer> biFun = null;
		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});
		System.out.println("[학생이름]");
		printString(t -> t.getName());
		
		System.out.println("[합계점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();
			}
			
		});

	}
}
