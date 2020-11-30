package com.yedam.collection;

public class Person/*extends Object 가 생략되어있는 것이다!*/ {
	private String name;
	
	public Person ( String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode(); //이름의 해시코드 
	}
	@Override
	public boolean equals(Object obj) { //이름의 값만 같다면 true 반환하겠다. 
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

