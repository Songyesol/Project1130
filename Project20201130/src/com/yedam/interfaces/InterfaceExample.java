package com.yedam.interfaces;

interface Runnable { // 인터페이스 안에는 추상메서드만 들어 갈 수 있어
	public void run();
}

class AutoRun implements Runnable { // runnable 인터페이스의 구현클래스
	@Override
	public void run() {
		System.out.println("자동실행");
	}
}
class NewRun implements Runnable{

	@Override
	public void run() {
		System.out.println("새로운 실행");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		//인터페이스는 직접적으로 인스턴스를 사용할 수 없기때문에 각구현클래스의 인스턴스를 받아서 사용
		Runnable runnable = new AutoRun(); 
		runnable.run();
		
		runnable = new NewRun();
		runnable.run();
		
		
		/*익명구현객체*/
		//익명의 구현객체를 만들어서 따로 클래스를 만들지않고 구현. 
		// 인터페이스는 원래 new 라는 키워드로 인스턴스를 만들 수 없음.
		// 영역안에서 클래스 이름 없이 사용할 내용을 담고 쓰는것.
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명실행");
			}
		};
		runnable.run();
		
		//람다표현식 (매개변수값이 없을때...)
		runnable = () -> System.out.println("또다른 익명실행");
		
		runnable.run();
	}
	
	
}
