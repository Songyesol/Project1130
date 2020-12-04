package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
	private static List<Students> list = Arrays.asList(new Students("송자바", "여자", 90), new Students("홍길동", "남자", 90),
			new Students("김순희", "여자", 95), new Students("박잡아", "남자", 80));

	public static double avg(Predicate<Students> predicate) {
		int count = 0;
		int sum = 0;
		for (Students student : list) {
			if (predicate.test(student)) {
				System.out.println(student.getName() + ", " + student.getSex() + ", " + student.getScore());
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;

	}

	public static void main(String[] args) {
		double maleAvg = avg(new Predicate<Students>() {

			@Override
			public boolean test(Students t) {
				
				return t.getSex().equals("남자");
			}
		});

		System.out.println("남학생평균: " + maleAvg);
		
		double femaleAvg = avg(new Predicate<Students>() {

			@Override
			public boolean test(Students t) {
				return t.getSex().equals("여자");
			}
			
		});
		System.out.println("여학생평균: " + femaleAvg);
	}
}
