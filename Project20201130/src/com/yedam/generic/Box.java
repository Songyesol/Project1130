package com.yedam.generic;

public class Box<T> { //어떤유형의클래스타입이이던지 다 담기위해서 박스라고 함
					  //클래스의 필드값을 선언하는 시점에 타입을 정하고 싶을때 제네릭<>사용합니다. 
	
	T obj; //object는 어떤 유형이든지 다 담을 수 있는 최상위 class
	            //Object는 모든 클래스의 부모클래스
	void set(T obj) { //필드값지정해주는 메소드
		this.obj = obj;
	}
	
	T get() { //필드값 반환하는 메소드
		return obj;
	}

}
