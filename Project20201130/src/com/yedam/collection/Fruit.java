package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;
	public Fruit() {
		
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.name.length() + this.price;
	}
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
//		Object obj -> Fruit 클래스로 캐스팅
		Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		return b1&&b2;
				
		//이렇게 오버라이드하면 주소값이 아닌 논리적인 객체로서 의미가 같다면 동일한 것으로 인식한다.
		
	}
}
