package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple{
	
}
public class BoxExample {
	public static void main(String[] args) {
//		Box box=new Box();
//		box.set("Hello");
//		String str = (String) box.get(); // 반환메소드의 선언타입이 object타입이기때문에
//										 // 강제 타입변환(casting)해서 받아와야한다. 할때마다 해줘야해
//		
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get();
//		box.set(new Apple());
//		str = (String) box.get();
		
		Box<String> box = new Box<String>();
		box.get(); //리턴해주는 타입이 String타입이 됨.
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		
		List<String> list = new ArrayList<>(); //Integer타입은 int 타입을 담는...! 
		list.add("hello");
//		list.add(10); //에러발생함. 왜냐하면... List클래스 선언시 String 타입을 담을 것을 제네릭타입을 통해 
					  // 넣어두었기 때문이다.  
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
		
	
		System.out.println("end");
	}
}
