package com.yedam.interfaces;

interface MyFunctionalInterface {
	public void run(int radius);
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		
		// 1. 화면출력 (원의 넓이를 구하는 기능 구현)
		MyFunctionalInterface fi = (circle)-> {
			double result = circle*circle *3.14;
			System.out.println("원 넓이: " + result);
		};
		fi.run(8);
		
		
		// 2. 화면출력 (밑변으로 가지는 삼각형의 넓이 구현)
		
		// 3. 화면출력 (정사각형의 넓이를구하는 기능 구현)
		
		fi = (rectangle) -> {
			int result1 = rectangle * rectangle;
			System.out.println("정사각형 넓이: " + result1);
		};
		fi.run(8);
	}
}
