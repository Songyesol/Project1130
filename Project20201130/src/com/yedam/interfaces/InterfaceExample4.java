package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mif = null;
		// 매개의 합
		mif = (a,b)-> a + b;
		//return구문이 하나밖에 없으면 return 선언과 중괄호를 없애도 정상작동
		
		int result = mif.run(10, 20);
		
		mif = (num1,num2)-> num1*num2 ;
		result = mif.run(5, 10);
			
		//2개의 변수 (직사각형의 가로와 세로) -> 넓이 기능 구현 
		mif = (g,s) -> g*s;
		result = mif.run(8, 10);
		System.out.println("결과값: " + result);
		
	} // end of main
}// end of class
