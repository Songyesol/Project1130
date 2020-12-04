package com.yedam.functional;

import java.util.function.ToDoubleFunction;

public class LamdaExample2 {
	public static S[] students = { new S("홍길동", 90, 60), new S("신용권", 95, 93) };
	
	public double avg(ToDoubleFunction<S> function) {
		double sum = 0;
		for(S list : students) {
			sum += function.applyAsDouble(list);
		}
	double avg = sum ;
		return avg;
		
	}
	


	static class S {
			private String name;
			private int englishScore;
			private int mathScore;
			
			public S(String name, int englishScore, int mathScore) {
				this.name = name;
				this.englishScore = englishScore;
				this.mathScore = mathScore;
			}

			public String getName() {
				return name;
			}

			public int getEnglishScore() {
				return englishScore;
			}

			public int getMathScore() {
				return mathScore;
			}
			
			
			
			
//		}
//	public static void main(String[] args) {
//		double englishAvg = avg(s -> s.getEnglishScore());
//		System.out.println("영어평균점수: " + englishAvg);
//
//		double mathAvg = avg(s -> s.getMathScore());
//		System.out.println("수학 평균점수:" + mathAvg);

	}
	}

