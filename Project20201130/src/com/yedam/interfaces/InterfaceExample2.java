package com.yedam.interfaces;
//functional interface (함수적 인터페이스)
// 인터페이스 안에 구현해야할 메소드가 1개만 존재해야한다
interface Cal{ 
	public void multi(int num);
}

interface Calculate {
	public void sum(int num1, int num2) ;
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		//functional interface 구현할 메소드가 1개 있을때 매개변수와 실행구문만 남겨둔 람다표현식 
		
		Cal cal= (num) -> { 
				int result = num*2;
				System.out.println(result);
		};
		cal.multi(3);
		
		cal = (a)-> {
			int result = a * a;
			System.out.println(result);
		};
		cal.multi(3);
		
		
		Calculate calculate = (int num1, int num2) -> {
				System.out.println(num1+num2);
		};
		calculate.sum(3, 5);
		
		calculate = (a , b) -> {
			System.out.println(a*b);
		};
		calculate.sum(3, 5);
		
			
		
		
	}
}
